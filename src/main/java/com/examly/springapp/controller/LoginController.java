package com.examly.springapp.controller;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// import com.examly.springapp.dao.LoginDao;
import com.examly.springapp.model.Login;
import com.examly.springapp.service.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
	private LoginService userService;
	// private Login user;

	public LoginController() {
	}

	public LoginController(LoginService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/login")	 
	public String addUser(@RequestBody Login user)
	{
		userService.saveAll(user);
		return "Login Success!!";
	}

	


	// @GetMapping("details")
	// public List<Login> getUsers(){
	// 	return this.repo.findAll();
	// }
}
