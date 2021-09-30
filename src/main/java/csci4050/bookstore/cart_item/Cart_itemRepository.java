package csci4050.bookstore.cart_item;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
 
public interface Cart_itemRepository extends CrudRepository<Cart_item, Cart_item_id> {
 

    public Cart_item findCart_itemById(Cart_item_id id);
    
    public List<Cart_item> findAllByIdCartid(Integer id);

    // For remove from cart
    public void deleteById(Cart_item_id id);
}