package com.example.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
	@Autowired
	RegistrationRepository registerRepo;
	
	public User createUser(User user) {
		return registerRepo.save(user);
	}
}
