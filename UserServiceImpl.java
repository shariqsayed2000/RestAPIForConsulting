package com.example.demo.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Message;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;

	@Override
	public Message addUser(User user) {
		Message mg = new Message();
		int flag = 0;
		if (!user.getFirstName().contains(" ") || !user.getLastName().contains(" ")) {
			flag += 1;
		}
		if(flag == 1){
			mg.setStatus("Sucess");
			mg.setData("Created Leads Sucessfully");
			repo.save(user);
			return mg;
		}else {
			mg.setStatus("Failure");
			mg.setData("Unable to create Leads");
			return mg;
		}
	}

	@Override
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<User> getUserByMoblie(Long mobile) {
		// TODO Auto-generated method stub
		return repo.findByMobile(mobile);
	}

	
}
