package com.globallogic.users.infraestructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.users.domain.User;
import com.globallogic.users.domain.UserResponse;
import com.globallogic.users.domain.repository.UserRepository;

@Component
public class HibernateUserRepository implements UserRepository{
	@Autowired
	private SpringDataH2UserRepository springDataH2Repository;
	
	private final static Logger logger = LoggerFactory.getLogger(HibernateUserRepository.class);

	
	@Override
	public UserResponse createUser(User user) {
		logger.info("Se crea entidad User y Phone");
		logger.info("user1"+user.toString());
		 UserEntity ue = springDataH2Repository.save(new UserEntity(user));
		 return new UserResponse(ue.getId(), ue.getCreated(), ue.getModified(), ue.getLastLogin(), ue.getActive(), ue.getToken());
	}


	@Override
	public UserEntity findByEmail(String mail) {
		return springDataH2Repository.findTitleByEmail(mail);
		
	}




}
