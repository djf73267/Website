package csci4050.bookstore;
import org.springframework.security.web.authentication.*;
import org.springframework.context.annotation.*;
import org.springframework.security.authentication.dao.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }
     
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
      
        authProvider.setHideUserNotFoundExceptions(false) ;
         
        return authProvider;
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*
        http.formLogin()
            .loginPage("/login")
            .usernameParameter("email")
            .passwordParameter("psw")
            .loginProcessingUrl("/doLogin")
            .defaultSuccessUrl("/home");
        */

        http.authorizeRequests()
            .antMatchers("/", "/home", "/register/**","/forgot","/reset", "/css/**", "/images/**","/login_failure", "/verify","/confirm", "/book/**", "/search").permitAll() // allows these URLs to be accessed by any user without authentication (patterns formatted as "/URL/**" will apply to everything after /URL/")
            .antMatchers("/cart").hasAnyAuthority("2", "3")
            //.antMatchers("/cart").hasAuthority("3")
            .antMatchers("/user/**").hasAnyAuthority("2", "3")
            //.antMatchers("/user/**").hasAuthority("3")
            .antMatchers("/orderhistory").hasAnyAuthority("2", "3") // 2 = customer
            //.antMatchers("/orderhistory").hasAuthority("3")
            .antMatchers("/admin/**").hasAuthority("1") // 1 = admin
            .anyRequest().authenticated()
            .and()
            .formLogin()
                .permitAll()
                .loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("psw")
                //.loginProcessingUrl("/doLogin")
                //.defaultSuccessUrl("/home")
                .failureHandler(authenticationFailureHandler())
                //.failureUrl("/login_failure")
            .and()
                .rememberMe()
                .key("key")
                .rememberMeParameter("remember")
            .and()
            .logout().permitAll()
            .and()
                .exceptionHandling().accessDeniedPage("/Access_Denied");
       
            
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return new CustomAuthenticationFailureHandler();
    }
}