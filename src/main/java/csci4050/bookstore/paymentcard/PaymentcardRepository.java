package csci4050.bookstore.paymentcard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PaymentcardRepository extends CrudRepository<Paymentcard, Integer> {

    @Query("SELECT p FROM Paymentcard p WHERE p.user_username = :user_username")
    public Paymentcard findPaymentCardByUsername(@Param("user_username") String user_username);


}