package com.raj.restapp.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.restapp.model.Register;
import com.raj.restapp.repository.RegisterRepo;
import com.raj.restapp.service.RegisterService;


@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepo repo;
		
	@Override
	public void addUser(Register user) {
        repo.save(user);
	}
	
	@Override
	public List<Register> getAllUser() {
		return repo.findAll();
	}

	
	@Override
	public Register getUserByEmail(String email) {
		return repo.findByEmail(email);
	}

	@Override
	public Register findByUserName(String email) {
		return repo.findByEmail(email);
	}
	
}
