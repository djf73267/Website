package csci4050.bookstore.promotion;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promotion {


    @Id
    @SequenceGenerator(name = "promoSeqGen", sequenceName = "promoSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "promoSeqGen")
    private Integer id;

    private String promoName;

    private Integer amount;

    private String startDate;

    private String endDate;

    private Integer order_id;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getPromoName() {
        return promoName;
      }
    
    public void setPromoName(String promoName){
        this.promoName = promoName;
      }


    public Integer getAmount(){
        return amount;
    }

    public void setAmount(Integer amount){
        this.amount = amount;
    }

    public String getStartDate(){
        return startDate;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public String getEndDate(){
    return endDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public Integer getOrder_ID(){
        return order_id;
        }
    
    public void setOrder_ID(Integer order_id){
        this.order_id = order_id;
    }

 
    
}
