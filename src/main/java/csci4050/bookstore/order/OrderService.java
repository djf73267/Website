package csci4050.bookstore.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service("orderService")
public class OrderService {

	private OrderRepository orderRepository;
	
    @Autowired
    public OrderService(OrderRepository orderRepository) { 
      this.orderRepository = orderRepository;
    }
    
	public Order findById(Integer id) {
		return orderRepository.findOrderById(id);
	}
	
	public List<Order> findOrdersByUsername(String username){
        return orderRepository.findOrdersByUsername(username);
    }

    
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}



}