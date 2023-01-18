package com.dannygutamafullstack.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dannygutamafullstack.app.entity.User;
import com.dannygutamafullstack.app.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired 
	private UserService userService;

///crear un nuevo usuario
	@PostMapping
	public ResponseEntity<?>crate (@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	
	}
	//leer un usuario
@GetMapping("/{id}")	
	public ResponseEntity<?> read (@PathVariable(value ="id") Long userId){
	Optional<User> oUser =userService.findById(userId);
	if(!oUser.isPresent()) {
		return ResponseEntity.ok(oUser);
	}
	return ResponseEntity.ok(oUser);
	
}
	
	
}
