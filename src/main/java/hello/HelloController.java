package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "Did you win? Yes. And what did it cost? Everything !!!!";
	}
	
}
