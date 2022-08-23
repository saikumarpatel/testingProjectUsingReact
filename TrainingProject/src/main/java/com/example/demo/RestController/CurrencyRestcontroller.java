package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.CurrencyRepo;
import com.example.demo.model.Currency;

@RestController
public class CurrencyRestcontroller {
	@Autowired
	private CurrencyRepo currencyrepo;
	@GetMapping("/getcurrency")
	public List<Currency> getcurrency(){
		return currencyrepo.findAll();
	}
	@PostMapping("/postcurrency")
	public Currency addcurrency(@RequestBody Currency newcurrency) {
		return currencyrepo.save(newcurrency);
	}
	@GetMapping("/getcurreny/{currencycode}")
	public Currency getcurrencybyid(@PathVariable("currencycode") String id) {
		return currencyrepo.findById(id).orElseThrow();
		
	}
	@DeleteMapping("/deletcurrency/{currencycode}")
	public void deletecurrencybyid(@PathVariable("currencycode") String id) {
		currencyrepo.deleteById(id);
	}

}
