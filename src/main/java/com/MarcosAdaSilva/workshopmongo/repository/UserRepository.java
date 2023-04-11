package com.MarcosAdaSilva.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MarcosAdaSilva.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
