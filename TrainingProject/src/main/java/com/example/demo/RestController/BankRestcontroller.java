package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.BankRepo;
import com.example.demo.model.Bank;

@RestController
public class BankRestcontroller {
	@Autowired
	private BankRepo bankrepo;
	public String greet() {
		return "hi Bank";
	}
	@GetMapping("/getbank")
	public List<Bank> Listbank(){
		return bankrepo.findAll();
	}
	@GetMapping("/getbank/{bic}")
	public Bank getbankbyid(@PathVariable("bic") String bic) {
		return bankrepo.findById(bic).orElseThrow();
	}
	@DeleteMapping("/deletebank/{bic}")
	public void deletebank(@PathVariable("bic") String id) {
			bankrepo.deleteById(id);
	}
	
	@PostMapping("/postbank")
	public Bank addbank(@RequestBody Bank newbank) {
		return bankrepo.save(newbank);
	}
	

}
