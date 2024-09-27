package message.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/message")
public class Controller {
	
	
	@GetMapping
	public String message() {
		return "Salve Átila, blz?";
	}

}
