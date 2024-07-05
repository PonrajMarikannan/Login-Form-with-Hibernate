package com.raj.restapp.service;

import java.util.List;

import com.raj.restapp.model.Register;


public interface RegisterService {
	
	public void addUser(Register emp);
	public List<Register> getAllUser();
	public Register getUserByEmail(String email);
	public Register findByUserName(String email);
	
//	public Employee getEmployee(int id);
//	public void updateEmp(Employee emp);
//	public void deleteEmployeebyId(int id);
	
}
 