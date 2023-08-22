package com.jhonerodrigues.workshopmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jhonerodrigues.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	
	List <Post> findByTitleContainingIgnoreCase (String text);
}
