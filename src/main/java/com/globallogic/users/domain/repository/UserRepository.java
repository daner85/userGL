package com.globallogic.users.domain.repository;

import com.globallogic.users.domain.User;
import com.globallogic.users.domain.UserResponse;
import com.globallogic.users.infraestructure.UserEntity;

public interface UserRepository {
	
	UserResponse createUser(User user);
	
	UserEntity findByEmail(String mail);

}
