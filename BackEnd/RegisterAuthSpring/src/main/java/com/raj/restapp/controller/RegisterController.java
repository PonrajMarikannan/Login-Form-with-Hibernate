package com.raj.restapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.raj.restapp.model.Register;
import com.raj.restapp.service.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 
 
@CrossOrigin("*") 
@RestController
@RequestMapping("/register")
public class RegisterController {
 
	@Autowired
	RegisterService service;
	
	@PostMapping
	public String insertUser(@RequestBody Register user) {
		String msg="";
		try {
			System.out.println(user);
			service.addUser(user);
			msg="Success";
		}
		catch(Exception e) {
			e.printStackTrace();
			msg="Failure";
		}
		return msg;
	}
 
//	@GetMapping("/all")
//	public List<Register> viewallUser() {
//		return service.getAllUser();
//	}
	
	@GetMapping("{userName}")
	public Register viewUserByEmail(@PathVariable("userName") String userName) {
		System.out.print("Hello");
		return service.getUserByEmail(userName);
	}
	
}
