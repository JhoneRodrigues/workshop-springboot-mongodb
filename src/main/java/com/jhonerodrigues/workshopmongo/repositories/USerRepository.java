package com.jhonerodrigues.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jhonerodrigues.workshopmongo.domain.User;

public interface USerRepository extends MongoRepository<User, String>{

}
