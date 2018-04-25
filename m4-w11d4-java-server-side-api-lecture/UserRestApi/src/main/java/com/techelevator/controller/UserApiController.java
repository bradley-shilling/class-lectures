package com.techelevator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.User;
import com.techelevator.model.UserDao;

@CrossOrigin(origins = "*")
@RestController //set up controller to function as 
public class UserApiController {
	
	@Autowired
	private UserDao dao;
	
	@RequestMapping(path="/users", method=RequestMethod.GET)
	public List<User> getAllUsersAsJson() {
		return dao.getAllUsers();
	}
	
	@RequestMapping(path="/users/{id}", method=RequestMethod.PUT)
	public boolean saveUserToDb(@ModelAttribute User  changedUser) {
		return dao.saveUser(changedUser);
	}
	
}