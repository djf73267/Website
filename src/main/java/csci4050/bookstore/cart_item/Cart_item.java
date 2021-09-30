package csci4050.bookstore.cart_item;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Cart_item {

    private Integer quantity;

    @EmbeddedId
    private Cart_item_id id;


    // Default constructor
    public Cart_item(){
    }

    public Cart_item(Cart_item_id id, Integer quantity){
        this.id = id;
        this.quantity = quantity;
    }


    public Cart_item_id getId(){
        return id;
    }

    public void setId(Cart_item_id id){
        this.id = id;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Integer getBookId(){
        return id.getBook_id();
    }
    

   

   
}