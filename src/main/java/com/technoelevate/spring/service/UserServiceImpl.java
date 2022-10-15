package com.technoelevate.spring.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technoelevate.spring.entity.User;
import com.technoelevate.spring.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	

	@Override
	public User addUser(User user,String getDeviceId) {
		user.setDeviceId(getDeviceId);
		return userRepository.save(user);
	}



	@Override
	@Transactional
	public User updateUser(User user,String getDeviceId) {
		User updateUser = userRepository.findById(user.getId()).orElseThrow();
		BeanUtils.copyProperties(user, updateUser);
		updateUser.setDeviceId(getDeviceId);
		return updateUser;
	}
}