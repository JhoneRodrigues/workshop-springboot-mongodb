package com.jhonerodrigues.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jhonerodrigues.workshopmongo.domain.User;

@Repository
public interface USerRepository extends MongoRepository<User, String>{

}
