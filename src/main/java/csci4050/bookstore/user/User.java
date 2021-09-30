package csci4050.bookstore.user;



import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class User {
  //@Id
  //@GeneratedValue(strategy=GenerationType.AUTO)
  //private Integer id;

  @Id
  private String username;

  private String password;

  private String firstname;
  
  private String lastname;

  private String email;

  private String phone_number;

  private Integer addressID;

  private Integer cart_id;

  
  private Integer usertype_id;

  private Integer userstatus_id;

  
  @Column(name = "promostatus")
  private Boolean promostatus;

	
	@Column(name = "confirmation_token")
  private String confirmationToken;

  @Column(name = "reset_token")
	private String resetToken;

  
  /*
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
*/

// @Column(name = "enabled")
// 	private boolean enabled;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username){
    this.username = username;
  }

 
  public String getPassword(){
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  



  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }



  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }




  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }



  public Integer getAddressID(){
    return addressID;
  }

  public void setAddressID(Integer addressID){
    this.addressID = addressID;
  }


  public Integer getCart_id(){
    return cart_id;
  }

  public void setCart_id(Integer cart_id){
    this.cart_id = cart_id;
  }

  public Integer getUsertype_id(){
    return usertype_id;
  }

  public void setUsertype_id(Integer usertype_id){
    this.usertype_id = usertype_id;
  }

  public Integer getUserstatus_id(){
    return userstatus_id;
  }

  public void setUserstatus_id(Integer userstatus_id){
    this.userstatus_id = userstatus_id;
  }

  public Boolean getPromostatus(){
    return promostatus;
  }

  public void setPromostatus(Boolean promostatus){
    this.promostatus = promostatus;
  }


  public String getPhone_number(){
    return phone_number;
  }

  public void setPhone_number(String phone_number){
    this.phone_number = phone_number;
  }


	public String getConfirmationToken() {
		return confirmationToken;
	}

	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
  }

  public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}
  
  // public void setEnabled(boolean value) {
	// 	this.enabled = value;
	//}

}
