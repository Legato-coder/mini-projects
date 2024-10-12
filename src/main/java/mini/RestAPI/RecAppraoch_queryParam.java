package mini.RestAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RecAppraoch_queryParam {

	@GetMapping("/test25")
	public ResponseEntity<String> greetMethod(@RequestParam("name") String str

	) {
		String msg = str +  "welcome to REST TEST with ResponseEntity built in method";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
