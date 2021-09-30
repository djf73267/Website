package csci4050.bookstore;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import csci4050.bookstore.address.Address;
import csci4050.bookstore.address.AddressRepository;

import csci4050.bookstore.paymentcard.Paymentcard;
import csci4050.bookstore.paymentcard.PaymentcardRepository;

import csci4050.bookstore.user.MyUserDetails;
import csci4050.bookstore.user.User;
import csci4050.bookstore.user.CustomerRepository;

 
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PaymentcardRepository paymentcardRepository;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        //System.out.println(username);
        User user = customerRepository.findByUsername(username);
        Address address = addressRepository.findAddressById(user.getAddressID());
        Paymentcard paymentcard = paymentcardRepository.findPaymentCardByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Invalid credentials.");
        }else{

            if(user.getUserstatus_id() == 1){
                //throw new UsernameNotFoundException("Please verify your email before logging in!");
            }else if(user.getUserstatus_id() == 3){
                //throw new UsernameNotFoundException("This account has been suspended.");
            }

            //System.out.println("address id in service imp: " + user.getAddressID());
           address = addressRepository.findAddressById(user.getAddressID());
           paymentcard = paymentcardRepository.findPaymentCardByUsername(user.getUsername());

            /*
            if(paymentcard == null){
                System.out.println("paymentcard is NULL!!!!");
            }else{
                System.out.println("paymentcard is NOT NULL!!!");
            }
            */

        }
         
        return new MyUserDetails(user, address, paymentcard);
    }
 
}