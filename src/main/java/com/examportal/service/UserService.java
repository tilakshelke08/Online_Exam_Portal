package com.examportal.service;

import java.util.List;

import com.examportal.entity.Grade;
import com.examportal.entity.User;

public interface UserService {

	User addUser(User user);
	
	User updateUser(User user);

	User getUserByEmailAndStatus(String emailId, String status);

	User getUserByEmailid(String emailId);

	List<User> getUserByRole(String role);
	
	User getUserById(int userId);
		
	User getUserByEmailIdAndRoleAndStatus(String emailId, String role, String status);
	
	List<User> updateAllUser(List<User> users);
	
	List<User> getUserByRoleAndStatus(String role, String status);
	
	List<User> getUsersByRoleAndGradeAndStatus(String role, Grade grade, String status);
	
}
