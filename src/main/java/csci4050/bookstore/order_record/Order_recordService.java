package csci4050.bookstore.order_record;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("order_recordService")
public class Order_recordService {

	private Order_recordRepository order_recordRepository;
	
    @Autowired
    public Order_recordService(Order_recordRepository order_recordRepository) { 
      this.order_recordRepository = order_recordRepository;
    }
    
	public Order_record findById(Order_record_id id) {
		return order_recordRepository.findOrder_recordById(id);
	}
	
	
    public List<Order_record> findAllByIdOrderid(Integer id){
		return order_recordRepository.findAllByIdOrderid(id);
	}
	

    
	public void saveOrder_record(Order_record order_record) {
		order_recordRepository.save(order_record);
	}

	
    // For remove from order history
	public void deleteById(Order_record_id id){
		order_recordRepository.deleteById(id);
	}


}