package com.globallogic.users.application;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.globallogic.users.application.exceptions.MailFoundException;
import com.globallogic.users.domain.User;
import com.globallogic.users.domain.UserResponse;
import com.globallogic.users.domain.service.UserService;

@RestController
@RequestMapping("/v1/users/")
public class UserController {
	
	private final static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping(produces= MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserResponse> createUser(@Valid @RequestBody final User user) throws MailFoundException{
		logger.info("Usuario"+ user.getName());
		UserResponse userNew;
		try {
			userNew = userService.createUser(user);
		} catch (MailFoundException e) {
			logger.error("El correo ya existe");
			Map<String, Object> body = new LinkedHashMap<>();
			body.put("mensaje", e.getMessage());
			return new ResponseEntity(body, HttpStatus.FOUND);
//			throw new MailFoundException();
		}
		return new ResponseEntity<>(userNew, HttpStatus.OK);
	}

}
