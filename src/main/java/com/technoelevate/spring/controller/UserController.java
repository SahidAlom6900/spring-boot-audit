package com.technoelevate.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.spring.entity.User;
import com.technoelevate.spring.response.UserResponse;
import com.technoelevate.spring.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController extends BaseController {

	private final UserService userService;

	@PostMapping
	public ResponseEntity<UserResponse> addUser(@RequestBody User user) {
		return ResponseEntity.ok(UserResponse.builder().error(false).message("")
				.data(userService.addUser(user, getDeviceId())).build());
	}

	@PutMapping
	public ResponseEntity<UserResponse> updateUser(@RequestBody User user) {
		return ResponseEntity.ok(UserResponse.builder().error(false).message("")
				.data(userService.updateUser(user, getDeviceId())).build());
	}
}
