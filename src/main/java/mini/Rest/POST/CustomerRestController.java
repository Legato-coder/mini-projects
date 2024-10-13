package mini.Rest.POST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    @PostMapping(value = "/customer", consumes = {"application/xml", "application/json"})
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
        String msg;
        System.out.println(customer);
        msg = "Customer record created";
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }
}
