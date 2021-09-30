package csci4050.bookstore.order;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

 
public interface OrderRepository extends CrudRepository<Order, Integer> {
 

    public Order findOrderById(Integer id);
    
    public List<Order> findOrdersByUsername(String username);

}