package com.jhonerodrigues.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.workshopmongo.domain.User;
import com.jhonerodrigues.workshopmongo.repositories.USerRepository;
import com.jhonerodrigues.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private USerRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById (String id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Not found object."));
	}
}
