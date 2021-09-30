package csci4050.bookstore.cart_item;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cart_itemService")
public class Cart_itemService {

	private Cart_itemRepository cart_itemRepository;
	
    @Autowired
    public Cart_itemService(Cart_itemRepository cart_itemRepository) { 
      this.cart_itemRepository = cart_itemRepository;
    }
    
	public Cart_item findById(Cart_item_id id) {
		return cart_itemRepository.findCart_itemById(id);
	}
	
	
    public List<Cart_item> findAllByIdCartid(Integer id){
		return cart_itemRepository.findAllByIdCartid(id);
	}
	

    
	public void saveCart_item(Cart_item cart_item) {
		cart_itemRepository.save(cart_item);
	}

	
    // For remove from cart
	public void deleteById(Cart_item_id id){
		cart_itemRepository.deleteById(id);
	}


}