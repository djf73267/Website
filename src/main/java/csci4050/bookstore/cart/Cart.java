package csci4050.bookstore.cart;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Cart {

    @Id
    @SequenceGenerator(name = "cartSeqGen", sequenceName = "cartSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "cartSeqGen")
    private Integer id;


    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    

   
}