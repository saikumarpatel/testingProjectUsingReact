package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.core.userdetails.ReactiveUserDetailsServiceResourceFactoryBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
public class MyRestController {
	@Autowired
	private UserRepository userRepo;
	public String greeting() {
		return "Good Morning";
	}
	@GetMapping("/get")
		public List<Users> ListUsers()
		{
			return userRepo.findAll();
		}
	@GetMapping("/get/{id}")
	Optional<Users> one(@PathVariable Long id) {
		return userRepo.findById(id);
	}
	@PostMapping("/post")
	public Users addcustomer(@RequestBody Users custuser) {
		return userRepo.save(custuser);
	}
	
	
}
