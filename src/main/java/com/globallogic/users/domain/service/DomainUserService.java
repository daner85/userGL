package com.globallogic.users.domain.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.globallogic.users.application.exceptions.MailFoundException;
import com.globallogic.users.domain.User;
import com.globallogic.users.domain.UserResponse;
import com.globallogic.users.domain.repository.UserRepository;
import com.globallogic.users.infraestructure.UserEntity;

public class DomainUserService implements UserService {
	
	private final UserRepository userRepository;
	
	private final static Logger logger = LoggerFactory.getLogger(DomainUserService.class);
	
	public DomainUserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	

	@Override
	public UserResponse createUser(User user) throws MailFoundException {
		logger.warn("Se verifica que el correo: "+ user.getEmail()+" no exista");
		UserEntity correo = userRepository.findByEmail(user.getEmail());
		
		if(null == correo) {
			logger.info("Se procede a crear el usuario");
			UserResponse ur =  userRepository.createUser(user);
			return ur;
		}else
			logger.error("El correo ya fue almacenado en BD");
			throw new MailFoundException("El correo ya fue almacenado en BD");
		
		
	}



}
