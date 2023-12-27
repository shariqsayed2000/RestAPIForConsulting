package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Message;
import com.example.demo.model.User;

public interface UserService {

	Message addUser(User user);

	List<User> allUser();

	List<User> getUserByMoblie(Long mobile);

}
