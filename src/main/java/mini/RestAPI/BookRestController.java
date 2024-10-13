package mini.RestAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    @GetMapping("/price/{isbn}")
    public ResponseEntity<String> getBookPrice(@PathVariable("isbn") String isbn) {
        String msg = "";

        // Correct the prices and fix the return statement
        if (isbn.equals("ISBN001")) {
            msg = "Price is 400$";
        } else if (isbn.equals("ISBN002")) {
            msg = "Price is 1000$";  // Corrected the typo in price
        } else {
            msg = "Book not available";
        }

        // Return the response message and HTTP status OK
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
