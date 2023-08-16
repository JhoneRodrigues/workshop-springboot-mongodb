package com.jhonerodrigues.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.workshopmongo.domain.User;
import com.jhonerodrigues.workshopmongo.repositories.USerRepository;

@Service
public class UserService {
	
	@Autowired
	private USerRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
}
