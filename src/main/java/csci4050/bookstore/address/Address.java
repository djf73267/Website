package csci4050.bookstore.address;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Address {

    @Id
    @SequenceGenerator(name = "addressSeqGen", sequenceName = "addressSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "addressSeqGen")
    private Integer id;

    private String street;

    private Integer zipcode;

    private String city;

    private String state;

    private String country;

    


    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }
    

    public Integer getZipcode(){
        return zipcode;
    }

    public void setZipcode(Integer zipcode){
        this.zipcode = zipcode;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }


    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }


}