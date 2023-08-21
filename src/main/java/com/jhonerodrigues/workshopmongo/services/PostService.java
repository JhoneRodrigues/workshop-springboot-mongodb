package com.jhonerodrigues.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.workshopmongo.domain.Post;
import com.jhonerodrigues.workshopmongo.repositories.PostRepository;
import com.jhonerodrigues.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById (String id) {
		Optional<Post> user = repository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Not found object."));
	}
}
