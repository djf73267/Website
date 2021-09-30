package csci4050.bookstore.order;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "`order`")
public class Order {

    @Id
    @SequenceGenerator(name = "orderSeqGen", sequenceName = "orderSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "orderSeqGen")
    private Integer id;

    @Column(name = "grandtotal")
    private Double total;

    @Column(name = "address_id")
    private Integer address_id;

    @Column(name = "cardnum")
    private Integer cardnum;


    @Column(name = "user_username")
    private String username;

    @Column(name = "date")
    private java.sql.Date date;



    // id
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    // total
    public Double getTotal(){
        return total;
    }

    public void setTotal(Double total){
        this.total = total;
    }

    // address_id
    public Integer getAddress_id(){
        return this.address_id;
    }

    public void setAddress_id(Integer address_id){
        this.address_id = address_id;
    }

    // cardnum;
    public Integer getCardnum(){
        return cardnum;
    }

    public void setCardnum(Integer cardnum){
        this.cardnum = cardnum;
    }

    // user_username
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }
   
    // date
    public Date getDate(){
        return date;
    }

    public void setDate(java.sql.Date date){
        this.date = date;
    }


}