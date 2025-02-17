package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.UserTaskEntity;

public interface UserTaskRepo extends JpaRepository<UserTaskEntity, Integer>{
	
}
