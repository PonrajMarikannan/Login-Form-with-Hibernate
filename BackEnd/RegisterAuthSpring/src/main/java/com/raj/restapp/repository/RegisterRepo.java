package com.raj.restapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.raj.restapp.model.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer> {
	
	@Query(value = "select r from Register r where r.email = :email")
	public Register findByEmail(String email);


}
