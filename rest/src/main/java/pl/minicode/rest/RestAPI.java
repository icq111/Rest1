package pl.minicode.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestAPI {

	@GetMapping("/hello")
	public String hello() {
		return "API works!";
	}
}
