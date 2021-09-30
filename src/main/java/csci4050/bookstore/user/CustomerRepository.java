package csci4050.bookstore.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
    Optional<User> findByEmail(String email);
	Optional<User> findByResetToken(String resetToken);

    public List<User> findByUsernameStartsWithIgnoreCase(String username);
    public List<User> findByPromostatus(Boolean status);
   //User findByConfirmationToken(String confirmationToken);
}