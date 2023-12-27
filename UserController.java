package com.example.demo.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	private Message addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping("/allUser")
	private List<User> getUser() {
		return userService.allUser();
	}

	@GetMapping("/userByNumber/{mobile}")
	private List<User> getUserByNumber(@PathVariable(name = "mobile") Long mobile){
		return userService.getUserByMoblie(mobile);
		
	}
}
