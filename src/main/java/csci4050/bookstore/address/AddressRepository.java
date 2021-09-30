package csci4050.bookstore.address;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AddressRepository extends CrudRepository<Address, Integer> {

    @Query("SELECT a FROM Address a WHERE a.id = :id")
    public Address findAddressById(@Param("id") Integer id);


}