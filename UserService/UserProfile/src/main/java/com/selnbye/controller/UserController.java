package com.selnbye.controller;

import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.selnbye.model.User;
import com.selnbye.service.UserService;

public class UserController {

private UserService UserSevice;
	
	@RequestMapping("/index")
	public String setupForm(Map<String,Object>map) {
		User User = new User();
		map.put("User", User);
		map.put("UserList", UserService.getAllUser());
		return "User";
	}
	
	@RequestMapping(value= "/User.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute User User, BindingResult result, @RequestParam String action,Map<String,Object>map ) {
		User UserResult = new User();
		switch(action.toLowerCase()) {
		case "add":
			UserService.add(User);
			UserResult =User;
			break;
			
		case "edit":
			UserService.edit(User);
			UserResult = User;
			break;
		case "delete":
			UserService.delete(User.getuid());
			UserResult = new User();
			break;
		case "search ":
			User searchedUser =UserService.getUser(User.getuid());
			UserResult = searchUser != null? searchedUser:new User();
			break;
		}
		
		map.put("User",UserResult);
		map.put("UserList",UserService.getAllUser());
		return "User";
	}
	
}