package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.CustomerUserRepo;
import com.example.demo.model.CustomerUser;


@RestController
public class CustomerUserRestcontroller {
	@Autowired
	private CustomerUserRepo customeruserrepo;
	@GetMapping("/getcustomeruser")
	public List<CustomerUser> getcustomer(){
		return customeruserrepo.findAll();
	}
	@GetMapping("/getcustomeruser/{userid}")
	public CustomerUser getcustomeruserbyid(@PathVariable("userid") Integer id) {
		return customeruserrepo.findById(id).orElseThrow();
	}
	@DeleteMapping("/deletecustomeruser/{userid}")
	public void deletcustomeruserbyid(@PathVariable("userid") Integer id) {
		customeruserrepo.deleteById(id);
	}
	@PostMapping("/postcustomeruser")
	public CustomerUser addcustomeruser(@RequestBody CustomerUser newcustomeruser) {
		return customeruserrepo.save(newcustomeruser);
	}

}
