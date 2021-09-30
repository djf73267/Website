package csci4050.bookstore.order_record;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Order_record {

    private Integer quantity;

    @EmbeddedId
    private Order_record_id id;


    // Default constructor
    public Order_record(){
    }

    public Order_record(Order_record_id id, Integer quantity){
        this.id = id;
        this.quantity = quantity;
    }


    public Order_record_id getId(){
        return id;
    }

    public void setId(Order_record_id id){
        this.id = id;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    
    public Integer getBookid(){
        return id.getBook_id();
    }

   

   
}