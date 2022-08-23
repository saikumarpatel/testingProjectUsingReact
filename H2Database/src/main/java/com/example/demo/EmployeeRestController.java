package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@CrossOrigin("*")
public class EmployeeRestController {
@Autowired
private EmployeeRepository employeerepo;
@GetMapping("/get")
public List<Employee> listAllEmployeeObjects(){
   return employeerepo.findAll();
}
@PostMapping("/post")
public Employee addmethod(@RequestBody Employee employee) {
	return employeerepo.save(employee);
}
@DeleteMapping("/delete/{id}")
public void deletebyid(@PathVariable Integer id) {
	employeerepo.deleteById(id);
}
}