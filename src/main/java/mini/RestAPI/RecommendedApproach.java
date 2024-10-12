package mini.RestAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendedApproach {

	
//	@GetMapping("/rec") //not recommended
//	public String grant() {
//		return "hello test";
//	}
//	
	
	//this is recommended appraoch
	@GetMapping("/test24")
	public ResponseEntity<String> greetMethod() {
		String msg="welcome to REST TEST with ResponseEntity built in method";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	

}
