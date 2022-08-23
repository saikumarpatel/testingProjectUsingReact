package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.TransfertypesRepo;
import com.example.demo.model.Transfertypes;

@RestController
public class TransfertypesRestcontroller {
	@Autowired
	private TransfertypesRepo transfertypesrepo;
	@GetMapping("gettransfertypes")
	public List<Transfertypes> gettransfertypes(){
		return  transfertypesrepo.findAll();
	}
	@GetMapping("/gettransfertypes/{transfertypecode}")
	public Transfertypes gettransfertypesbyid(@PathVariable("transfertypecode") String id) {
		return transfertypesrepo.findById(id).orElseThrow();
	}
	@DeleteMapping("/deletetransfertypes/{transfertypecode}")
	public void deletetransfertypebyid(@PathVariable("transfertypecode") String id) {
		transfertypesrepo.deleteById(id);
	}
	@PostMapping("/posttransfertypes")
	public Transfertypes addtranfertypes(@RequestBody Transfertypes newtranfertypes) {
		return transfertypesrepo.save(newtranfertypes);
	}

}
