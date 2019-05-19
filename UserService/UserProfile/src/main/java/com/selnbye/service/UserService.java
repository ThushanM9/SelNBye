package com.selnbye.service;


import com.selnbye.model.User;
import com.sun.tools.javac.util.List;

public interface UserService {
	
	//add
			public void add(User User) ;
			
			//update
			public void edit(User User);
			
			//delete
			public void delete(int uid);
			
			
			public User getUser (int uid);
			
			//view user details
			public List getAllUser();
}
