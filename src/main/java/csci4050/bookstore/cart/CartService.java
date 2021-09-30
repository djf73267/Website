package csci4050.bookstore.cart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("cartService")
public class CartService {

	private CartRepository cartRepository;
	
    @Autowired
    public CartService(CartRepository cartRepository) { 
      this.cartRepository = cartRepository;
    }
    
	public Cart findById(Integer id) {
		return cartRepository.findCartById(id);
	}
	
	

    
	public void saveCart(Cart cart) {
		cartRepository.save(cart);
	}



}