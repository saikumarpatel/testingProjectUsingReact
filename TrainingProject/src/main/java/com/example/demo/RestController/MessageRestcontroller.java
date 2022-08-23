package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.MessageRepo;
import com.example.demo.model.Message;

@RestController
public class MessageRestcontroller {
	@Autowired
	private MessageRepo messagerepo;
	@GetMapping("/getmessage")
	public List<Message> getmessage(){
		return messagerepo.findAll();
	}
	@GetMapping("/getmessage/{messagecode}")
	public Message getmessagebyid(@PathVariable("messagecode") String id) {
		return  messagerepo.findById(id).orElseThrow();
	}
	@DeleteMapping("/deletemessage/{messagecode}")
	public void deletemessagebyid(@PathVariable("messagecode") String id) {
		messagerepo.deleteById(id);
	}
	@PostMapping("/postmessage")
	public Message message(@RequestBody Message message) {
		return messagerepo.save(message);
	}
	

}
