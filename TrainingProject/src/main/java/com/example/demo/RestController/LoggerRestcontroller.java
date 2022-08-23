package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.LoggerRepo;
import com.example.demo.model.Logger;

@RestController
public class LoggerRestcontroller {
	@Autowired
	private LoggerRepo loggerrepo;
	@GetMapping("/getlogger")
	public List<Logger> getlogger(){
		return loggerrepo.findAll();
	}
	@GetMapping("/getlogger/{loggerid}")
	public Logger getloggerbyid(@PathVariable("loggerid") Integer id) {
		return loggerrepo.findById(id).orElseThrow();
	}
	@DeleteMapping("/deletelogger/{loggerid}")
	public void deleteloggerbyid(@PathVariable("loggerid") Integer id) {
		loggerrepo.deleteById(id);
	}
	@PostMapping("/postlogger")
	public Logger addlogger(@RequestBody Logger  newlogger) {
		return loggerrepo.save(newlogger);
		
	}
	
}
