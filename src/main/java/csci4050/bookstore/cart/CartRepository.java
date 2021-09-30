package csci4050.bookstore.cart;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


 
public interface CartRepository extends CrudRepository<Cart, Integer> {
 

    public Cart findCartById(Integer id);
    
    

}