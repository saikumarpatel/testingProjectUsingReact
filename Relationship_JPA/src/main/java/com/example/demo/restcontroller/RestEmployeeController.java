package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repo.Employeerepository;


@RequestMapping("/employee")
@RestController

public class RestEmployeeController {
	@Autowired
	private Employeerepository employeeRepository;
	@GetMapping("/get")
	public List<Employee> listEmployees(){
		return employeeRepository.findAll();
	}
	@PostMapping("/post")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeRepository.save(employee);
	}

}
