package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.User;
import ua.repository.UserRepository;

@Service
public class ShowUsersService {

	@Autowired
	private UserRepository userRepository;
	
	public void banUser(int id){
		User user = userRepository.findOne(id);
		user.setBan(true);
		userRepository.save(user);
	}
	
	public void unbanUser(int id){
		User user = userRepository.findOne(id);
		user.setBan(false);
		userRepository.save(user);
	}

}
