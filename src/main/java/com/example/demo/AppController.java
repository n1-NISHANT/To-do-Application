package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Entity.UserTaskEntity;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Repo.UserTaskRepo;
import com.example.demo.Validation.UserService;
import com.example.demo.user.LoginData;
import com.example.demo.user.UserTask;

@Controller
public class AppController {
	
	@Autowired
	private UserRepo repo ;
	
	@Autowired
	private UserTaskRepo erepo;
	
	@Autowired
	private UserService userService;
	
	//==========================================================
	@GetMapping("/")
	public String getForm(HttpServletRequest req) {
	  return "index";
	}
	
	@GetMapping("/login")
	public String getLogin(Model model) {
		
		return "login";
	}
	
	
	//---------------------------------------------------------
	
	@PostMapping("/userLogin")
	public String getTask(String email , String pwd ,Model model) {	
		
		if(userService.authenticate(email, pwd)) {
			model.addAttribute("viewtask", "View Task");
			return "task";
		}
		else {
			model.addAttribute("error", "Invalid  Email and Password...");
			return "login";
		}
	}
	@PostMapping("/task")
	public String getTask(UserTask utask ,Model model) {
		
		UserTaskEntity uEntity = new UserTaskEntity();
		BeanUtils.copyProperties(utask, uEntity);
	
		erepo.save(uEntity);
		
		model.addAttribute("msg", "Task Save...");
		
		return "task";
	}
	//---------------------------------------------------------
	//goto signIn page
	@GetMapping("/signin")
	public String getSignin(Model model) {
		
		return "signin";
	}
	//SignIn page data save into Data base
	@PostMapping("/userSignin")
	public String getSignin(LoginData logdata , Model model) {
        System.out.println(logdata);
		
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(logdata, entity);
		
		repo.save(entity);
		
		model.addAttribute("msg", "Registration Successfull...");
		model.addAttribute("login", "Login");
		return "signin";
	}
	//================================================================
	
	@GetMapping("/viewTask")
	public String getViewTask(Model model) {
		
		   List<UserTaskEntity> usertask =  erepo.findAll();
		   
		   model.addAttribute("user", usertask);
		
		return "viewTask";
	}
	
}
