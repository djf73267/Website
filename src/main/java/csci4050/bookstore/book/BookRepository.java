package csci4050.bookstore.book;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
 
public interface BookRepository extends CrudRepository<Book, Integer> {
 
   

    @Query("SELECT b FROM Book b WHERE b.id = :id")
    public Book findBookById(@Param("id") Integer id);

    public Book findBookByISBN(String ISBN);
    
    // Get list of books whose usernames start with the specified string
    public List<Book> findByTitleContainingIgnoreCase(String title);


    // Get all books
    public List<Book> findAll();

    // For homepage; Returns books with most recently added book at top
    public List<Book> findAllByOrderByIdDesc();


    // Default search; books sorted by title
    public List<Book> findAllByOrderByTitleAsc();
}