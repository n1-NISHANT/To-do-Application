package com.example.demo.Validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public boolean authenticate(String email, String pwd) {
		
		UserEntity userentity = userRepo.findByEmail(email);
		if(userentity != null) {
			
			return userentity.getPwd().equals(pwd);
		}else {
			return false;
		}
	}
}
