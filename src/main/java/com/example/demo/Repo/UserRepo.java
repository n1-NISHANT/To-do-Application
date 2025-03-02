package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{

	UserEntity findByEmail(String email); 
	UserEntity findByPwd(String pwd);
}
