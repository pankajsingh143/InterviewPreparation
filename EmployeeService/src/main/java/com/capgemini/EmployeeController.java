package com.capgemini;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping(value = "/hello/{user}")
	public String greeting(@PathVariable String user) {
		return " Hello " + user;
	}

}
