package csci4050.bookstore.paymentcard;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("paymentcardService")
public class PaymentcardService {

	private PaymentcardRepository paymentcardRepository;
	
    @Autowired
    public PaymentcardService(PaymentcardRepository paymentcardRepository) { 
      this.paymentcardRepository = paymentcardRepository;
    }
    
	public Paymentcard findById(String username) {
		return paymentcardRepository.findPaymentCardByUsername(username);
	}
    
    
	public void savePaymentcard(Paymentcard paymentcard) {
		paymentcardRepository.save(paymentcard);
	}



}