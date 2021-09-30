package csci4050.bookstore.cart_item;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class Cart_item_id implements Serializable {

    @Column(name = "cart_id", nullable = false)
    private Integer cartid;

    @Column(name = "book_id", nullable = false)
    private Integer book_id;

    /** getters and setters **/

    // Default constructor
    public Cart_item_id(){
    }

    public Cart_item_id(Integer cartid, Integer book_id){
        this.cartid = cartid;
        this.book_id = book_id;
    }

    public Integer getCartid(){
        return cartid;
    }

    public void setCart_id(Integer cartid){
        this.cartid = cartid;
    }

    public Integer getBook_id(){
        return book_id;
    }

    public void setBook_id(Integer book_id){
        this.book_id = book_id;
    }
}