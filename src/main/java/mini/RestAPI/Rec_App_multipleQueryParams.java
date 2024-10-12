package mini.RestAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rec_App_multipleQueryParams {

    @GetMapping("/test26")
    public ResponseEntity<String> getDataM(@RequestParam("Cname") String cname, @RequestParam("tname") String tname) {

        String responseMsg;
        // Use '&&' for logical AND
        if (cname.equals("SBMS") && tname.equals("Santhosh")) {
            responseMsg = "New Batch " + cname + " will start soon with " + tname + " within a week.";
        } else {
            responseMsg = "Please wait for some time.";
        }

        // Return a response entity with the message and status
        return new ResponseEntity<>(responseMsg, HttpStatus.OK);
    }
    //http://localhost:8080/test26?Cname=SBMS&tname=Santhosh
}
