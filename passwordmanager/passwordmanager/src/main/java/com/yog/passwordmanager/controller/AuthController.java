package com.yog.passwordmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yog.passwordmanager.exception.UserAlreadyExistsException;
import com.yog.passwordmanager.paylod.requests.SignupRequest;
import com.yog.passwordmanager.paylod.responses.AppResponse;
import com.yog.passwordmanager.service.UserService;

import jakarta.validation.Valid;

@RestController
public class AuthController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<AppResponse<String>> signup(@Valid @RequestBody SignupRequest signupRequest) throws UserAlreadyExistsException{
		userService.createUser(signupRequest);
		return ResponseEntity.ok(new AppResponse<String>(HttpStatus.OK.value(),"",""));
	}

}
