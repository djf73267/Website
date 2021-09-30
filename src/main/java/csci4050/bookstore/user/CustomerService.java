package csci4050.bookstore.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service("customerService")
public class CustomerService {

	private CustomerRepository customerRepository;
	
    @Autowired
    public CustomerService(CustomerRepository customerRepository) { 
      this.customerRepository = customerRepository;
    }
    
	public User findByUsername(String username) {
		return customerRepository.findByUsername(username);
	}


	public List<User> listAll() {
        return customerRepository.findAll();
    }
	public List<User> findByUsernameStartsWithIgnoreCase(String username){
		return customerRepository.findByUsernameStartsWithIgnoreCase(username);
	}
	
	public List<User> findByPromostatus(Boolean status){
		return customerRepository.findByPromostatus(status);
	}
    
	// public User findByConfirmationToken(String confirmationToken) {
	// 	return customerRepository.findByConfirmationToken(confirmationToken);
	// }
    
    
	public void saveCustomer(User customer) {
		customerRepository.save(customer);
	}

	public Optional findUserByEmail(String email) {
		return customerRepository.findByEmail(email);
	}

	public Optional findUserByResetToken(String resetToken) {
		return customerRepository.findByResetToken(resetToken);
	}

}