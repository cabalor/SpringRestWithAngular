package pl.cbl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

	
	@RequestMapping("/city")
	public String getCity() {
		return "name: londyn, population: 10000000";
	}
	
	
	
	
}
