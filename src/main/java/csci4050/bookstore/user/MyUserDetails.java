package csci4050.bookstore.user;
 
import java.util.Arrays;
import java.util.Collection;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import csci4050.bookstore.address.Address;
import csci4050.bookstore.paymentcard.Paymentcard;
 
public class MyUserDetails implements UserDetails {
 
    private User user;
    private Address address; 
    private Paymentcard paymentcard;

    public MyUserDetails(User user, Address address, Paymentcard paymentcard) {
        this.user = user;
        this.address = address;
        this.paymentcard = paymentcard;
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("" + user.getUsertype_id());
        return Arrays.asList(authority);
    }
 
    @Override
    public String getPassword() {
        return user.getPassword();
    }
 
    @Override
    public String getUsername() {
        return user.getUsername();
    }
 
    public String getFirstname(){
        return user.getFirstname();
    }

    public String getLastname(){
        return user.getLastname();
    }

    public String getFullname()
    {
        return user.getFirstname() + " " + user.getLastname();
    }

    public String getEmail() {
        return user.getEmail();
    }

    public String getPhone_number(){
        return user.getPhone_number();
    }
    
    private Integer getUserStatus(){
        return user.getUserstatus_id();
    }

    public Integer getCart_id(){
        return user.getCart_id();
    }

    public User getUser(){
        return user;
    }

    //@Override
    public String getConfirmationToken(){
        return user.getConfirmationToken();
    }

    public void updateStatus(Integer status){
        user.setUserstatus_id(status);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {

        if(getUserStatus() == 1){ // user is inactive (have not confirmed email)
            return false;
        }
    
        return true;   
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {

        if(getUserStatus() == 3){ // user is suspended
            return false;
        }

        return true;
    }
 


    // Address methods
    public Address getAddress(){
        return address;
    }

    public String getStreet(){
        return address.getStreet();
    }


    // Paymentcard methods
    public Paymentcard getPaymentcard(){
        return paymentcard;
    }

    public String getType(){
        return paymentcard.getType();
    }

    public Integer getCardNum(){
        return paymentcard.getCardNum();
    }

    public Integer getZipcode(){
        return address.getZipcode();
    }
    public String getState(){
        return address.getState();
    }
    public String getExp_date(){
        return paymentcard.getExp_date();
    }

}