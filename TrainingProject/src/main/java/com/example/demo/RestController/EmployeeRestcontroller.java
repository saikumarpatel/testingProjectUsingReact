package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.EmployeeRepo;
import com.example.demo.model.Employee;

@RestController
public class EmployeeRestcontroller {
	@Autowired
	private EmployeeRepo employeerepo;
	@GetMapping("/getemployee")
	public List<Employee> getemployee(){
		return employeerepo.findAll();
	}
	@GetMapping("/getemployee/{employeeid}")
	public Employee getemployeebyid(@PathVariable("employeeid") Integer id) {
		return employeerepo.findById(id).orElseThrow();
	}
	@DeleteMapping("/deleteemployee/{employeeid}")
	public void deleteemployeebyid(@PathVariable("employeeid") Integer id) {
		employeerepo.deleteById(id);
	}
	@PostMapping("/postemployee")
	public Employee addemployee(@RequestBody Employee newemployee) {
		return  employeerepo.save(newemployee);
	}

}
