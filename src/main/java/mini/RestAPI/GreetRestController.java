package mini.RestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	
	@GetMapping("/hello")
	public String greet() {
		return "test purpse";
	}

}
