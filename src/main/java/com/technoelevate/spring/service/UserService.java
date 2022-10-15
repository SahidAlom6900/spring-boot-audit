package com.technoelevate.spring.service;

import com.technoelevate.spring.entity.User;

public interface UserService {
	
	User addUser(User user,String getDeviceId);

	User updateUser(User user,String getDeviceId);

}
