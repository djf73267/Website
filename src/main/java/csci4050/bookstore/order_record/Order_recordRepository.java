package csci4050.bookstore.order_record;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
 
public interface Order_recordRepository extends CrudRepository<Order_record, Order_record_id> {
 

    public Order_record findOrder_recordById(Order_record_id id);
    
    public List<Order_record> findAllByIdOrderid(Integer id);

    // For remove from orders
    public void deleteById(Order_record_id id);
}