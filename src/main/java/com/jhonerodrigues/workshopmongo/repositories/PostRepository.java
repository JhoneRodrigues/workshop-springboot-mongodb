package com.jhonerodrigues.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jhonerodrigues.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
