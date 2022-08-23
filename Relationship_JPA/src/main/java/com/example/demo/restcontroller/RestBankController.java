package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bank;
import com.example.demo.repo.Bankrepository1;

//import java.util.*;
import java.util.List;

@RestController
@RequestMapping("/bank")
public class RestBankController {
	@Autowired
	private Bankrepository1 bankRepository;
	
	@GetMapping("/get")
	public List<Bank> listBanks(){
		return bankRepository.findAll();
	}
	@PostMapping("/post")
	public Bank addBank(@RequestBody Bank bank)
	{
		return bankRepository.save(bank);
	}
	

}
