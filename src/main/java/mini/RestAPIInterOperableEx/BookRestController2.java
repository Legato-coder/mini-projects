package mini.RestAPIInterOperableEx;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// this class N other class will gernate data in JSON Format
@RestController
public class BookRestController2 {

    // Mapping this method to a GET request on "/book"
    @GetMapping("/book")
    public ResponseEntity<Book> getBook() {
        // Create a Book object
        Book book = new Book(101, "Spring", 400.00);
        
        // Return the book object with HTTP 200 status
        return new ResponseEntity<Book>(book, HttpStatus.OK);
        
        
       
    }

}
