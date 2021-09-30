package csci4050.bookstore.book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("bookService")
public class BookService {

	private BookRepository bookRepository;
	
    @Autowired
    public BookService(BookRepository bookRepository) { 
      this.bookRepository = bookRepository;
    }
    
	public Book findById(Integer id) {
		return bookRepository.findBookById(id);
	}
	
	public Book findByISBN(String ISBN){
		return bookRepository.findBookByISBN(ISBN);
	}
	

	public List<Book> findAll(){
		return bookRepository.findAll();
	}

	// Used by homepage for recently added books
	public List<Book> findAllByOrderByIdDesc(){
		return bookRepository.findAllByOrderByIdDesc();
	}

	public List<Book> findAllByOrderByTitleAsc(){
		return bookRepository.findAllByOrderByTitleAsc();
	}
    
	public void saveBook(Book book) {
		bookRepository.save(book);
	}



}