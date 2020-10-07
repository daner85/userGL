package com.globallogic.users.domain.service;

import com.globallogic.users.application.exceptions.MailFoundException;
import com.globallogic.users.domain.User;
import com.globallogic.users.domain.UserResponse;

public interface UserService {
	
	UserResponse createUser(User user) throws MailFoundException;

}
