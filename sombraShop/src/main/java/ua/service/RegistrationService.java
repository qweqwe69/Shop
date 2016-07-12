package ua.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.entity.Role;
import ua.entity.User;
import ua.repository.UserRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		if(user.getRole() == null){
			user.setRole(Role.ROLE_USER);
		}
		userRepository.save(user);
	}
	
}
