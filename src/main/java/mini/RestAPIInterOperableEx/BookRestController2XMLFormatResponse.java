package mini.RestAPIInterOperableEx;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController2XMLFormatResponse {

	// Using 'produces' attribute inside @GetMapping to return XML format
	@GetMapping(value = "/book", produces = { 
			MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Book> getBook() {
		// Create a Book object
		Book book = new Book(101, "Spring", 400.00);

		// Return the book object in XML format with HTTP 200 status
		return new ResponseEntity<>(book, HttpStatus.OK);
	}
}
