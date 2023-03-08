package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.model.model;
import com.example.demo.service.service;
@CrossOrigin
@RestController
public class controller {
	@Autowired(required=true) //extends another class
         service doctorService;
	
	@PostMapping("/addDetails")
	
	public model addInfo(@RequestBody model st) {
		return doctorService.saveDetails(st);
	}
	@GetMapping("/showDetails")
	public List<model>fetchDetails(){
		return doctorService.getDetails();
	}
	@PutMapping("/updateDetails")
	public model updateInfo(@RequestBody model st1) {
		return doctorService.UpdateDetails(st1);
	}
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteInfo(@PathVariable("id") int id)
	{
		doctorService.deleteDetails(id);
		return "deleted";
	}
	@GetMapping("/hospital/{field}")
	public List<model>getWithSort(@PathVariable String field){
		return doctorService.getSorted(field);
	}
	@GetMapping("/hospital/{offset}/{pageSize}")
	public List<model>productWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		return doctorService.getWithPagination(offset,pageSize);
	}
}
