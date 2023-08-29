package com.yog.passwordmanager.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.yog.passwordmanager.entities.User;
import com.yog.passwordmanager.exception.UserAlreadyExistsException;
import com.yog.passwordmanager.paylod.requests.SignupRequest;
import com.yog.passwordmanager.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public void createUser(SignupRequest signupRequest) throws UserAlreadyExistsException {

		if (userRepository.existsById(signupRequest.emailId()))
			throw new UserAlreadyExistsException("User already exists");

		User user = new User(signupRequest.emailId(), passwordEncoder.encode(signupRequest.password()));

		userRepository.save(user);
	}

}
