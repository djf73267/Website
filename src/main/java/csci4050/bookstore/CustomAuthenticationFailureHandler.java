package csci4050.bookstore;

import java.util.Map;
import java.util.HashMap;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.*;
import java.io.IOException;
import javax.servlet.ServletException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;

public class CustomAuthenticationFailureHandler 
  implements AuthenticationFailureHandler {
 
   
 
    @Override
    public void onAuthenticationFailure(
      HttpServletRequest request,
      HttpServletResponse response,
      AuthenticationException exception) 
      throws IOException, ServletException {
 
        if(exception.getMessage().equals("User account is locked")){      // User status is inactive

          RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
          redirectStrategy.sendRedirect(request, response, "/verify");
          //response.sendRedirect("/login_failure");
          //System.out.println("should redirect right here");
        }else if(exception.getMessage().equals("Invalid credentials.") || exception.getMessage().equals("Bad credentials")){                                                            // SUspen or bad credentials
         
          //response.sendRedirect("/login_failure");
          RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
          redirectStrategy.sendRedirect(request, response, "/login_failure?error=invalid");
        }else{
          RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
          redirectStrategy.sendRedirect(request, response, "/login_failure?error=suspended");
        }
        //System.out.println(exception.getMessage());
 
        
    }
}