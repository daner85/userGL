package com.globallogic.users.infraestructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.globallogic.users.domain.repository.UserRepository;
import com.globallogic.users.domain.service.DomainUserService;
import com.globallogic.users.domain.service.UserService;

@Configuration
@ComponentScan("com.globallogic.users")
public class BeanConfiguration {
	
	@Bean
	UserService userService(final UserRepository userRepository) {
		return new DomainUserService(userRepository);
	}
	
	 

}
