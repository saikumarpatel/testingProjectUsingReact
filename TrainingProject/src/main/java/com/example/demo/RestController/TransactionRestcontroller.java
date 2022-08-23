package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.TransactionRepo;
import com.example.demo.model.Transaction;

@RestController
public class TransactionRestcontroller {
	@Autowired
	private TransactionRepo transactionrepo;
	@GetMapping("gettransaction")
	public List<Transaction> gettransaction(){
		return transactionrepo.findAll();
		
	}
	@GetMapping("/gettransaction/{transactionid}")
	public Transaction gettransactionbyid(@PathVariable("transactionid") Integer id) {
		return transactionrepo.findById(id).orElseThrow();
	}
	@DeleteMapping("/deletetransaction/{transactionid}")
	public void deletetransactionbyid(@PathVariable("transactionid") Integer id) {
		transactionrepo.deleteById(id);
	}
	@PostMapping("/posttransaction")
	public Transaction addtransaction(@RequestBody Transaction newtransaction) {
		return transactionrepo.save(newtransaction);
	}

}
