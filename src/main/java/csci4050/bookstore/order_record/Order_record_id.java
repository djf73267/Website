package csci4050.bookstore.order_record;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class Order_record_id implements Serializable {

    @Column(name = "order_id", nullable = false)
    private Integer orderid;

    @Column(name = "book_id", nullable = false)
    private Integer book_id;

    /** getters and setters **/

    // Default constructor
    public Order_record_id(){
    }

    public Order_record_id(Integer orderid, Integer book_id){
        this.orderid = orderid;
        this.book_id = book_id;
    }

    public Integer getOrderid(){
        return orderid;
    }

    public void setOrderid(Integer orderid){
        this.orderid = orderid;
    }

    public Integer getBook_id(){
        return book_id;
    }

    public void setBook_id(Integer book_id){
        this.book_id = book_id;
    }
}