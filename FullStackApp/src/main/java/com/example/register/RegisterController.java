package com.example.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class RegisterController {
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping("/register")
	public User createUser(@RequestBody User user) {
		return registrationService.createUser(user);
	}
}
