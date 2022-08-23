package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.CustomerRepo;
import com.example.demo.model.Customer;

@RestController
@CrossOrigin("*")
public class CustomerRestcontroller {
	@Autowired
	private CustomerRepo customerrepo;
	@GetMapping("/getcustomer")
	public List<Customer> getcustomer(){
		return customerrepo.findAll();
	}
	@GetMapping("/getcustomer/{customerid}")
	public Customer getcustomerbyid(@PathVariable("customerid") String id) {
		return customerrepo.findById(id).orElseThrow();
	}
	@DeleteMapping("/deletecustomer/{customerid}")
	public void deletecustomerbyid(@PathVariable("customerid") String id) {
		customerrepo.deleteById(id);
	}
	@PostMapping("/postcustomer")
	public Customer addcustomer(@RequestBody Customer newcustomer) {
		return  customerrepo.save(newcustomer);
	}
	

}
