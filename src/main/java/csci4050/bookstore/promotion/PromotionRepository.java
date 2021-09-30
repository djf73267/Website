package csci4050.bookstore.promotion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PromotionRepository extends JpaRepository<Promotion, Integer> {

    @Query("SELECT a FROM Promotion a WHERE a.id = :id")
    public Promotion findPromotionById(@Param("id") Integer id);


    public Promotion findPromotionByPromoName(String promoName);

}