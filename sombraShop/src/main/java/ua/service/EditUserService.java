package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.entity.User;
import ua.repository.UserRepository;

@Service
public class EditUserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void editUser(int id, String firstName, String lastName, String email, String phone){
		User user = userRepository.findOne(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhone(phone);
		userRepository.save(user);
	}
	
}
