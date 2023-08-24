package com.jhonerodrigues.workshopmongo.services;

import java.util.Date;
import java.util.List;
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
	
	public List <Post> findByTitle (String text){
		return repository.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repository.fullSearch(text, minDate, maxDate);
	}
}
