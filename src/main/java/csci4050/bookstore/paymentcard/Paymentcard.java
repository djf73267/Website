package csci4050.bookstore.paymentcard;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Paymentcard {

    @Id
    @SequenceGenerator(name = "cardSeqGen", sequenceName = "cardSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "cardSeqGen")
    private Integer id;

    private Integer cardNum;

    private Integer CVV;

    private String exp_date;

    private Integer address_id;

    private String user_username;

    private String type;

    
    // id
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    // cardnum
    public Integer getCardNum(){
        return cardNum;
    }

    public void setCardNum(Integer cardNum){
        this.cardNum = cardNum;
    }

    // CVV
    public Integer getCVV(){
        return CVV;
    }

    public void setCVV(Integer CVV){
        this.CVV = CVV;
    }

    //date
    public String getExp_date(){
        return exp_date;
    }

    public void setExp_date(String exp_date){
        this.exp_date = exp_date;
    }
    

    // address_id
    public Integer getAddress_id(){
        return address_id;
    }

    public void setAddress_id(Integer address_id){
        this.address_id = address_id;
    }

    // user_username
    public String getUser_username(){
        return user_username;
    }

    public void setUser_username(String user_username){
        this.user_username = user_username;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
}