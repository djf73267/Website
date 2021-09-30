package csci4050.bookstore.book;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Book {

    @Id
    @SequenceGenerator(name = "bookSeqGen", sequenceName = "bookSeq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "bookSeqGen")
    private Integer id;

    private String ISBN;

    private String title;

    private String author;

    private Integer quantity;

    private Integer price;

    private String cover_picture;

    private String description;

    private Integer promotion_id;

    


    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }


    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }


    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }


    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }


    public String getCover_picture(){
        return cover_picture;
    }

    public void setCover_picture(String cover_picture){
        this.cover_picture = cover_picture;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Integer getPromotion_id(){
        return promotion_id;
    }

    public void setPromotion_id(Integer promotion_id){
        this.promotion_id = promotion_id;
    }


}