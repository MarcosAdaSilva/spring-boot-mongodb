package com.MarcosAdaSilva.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MarcosAdaSilva.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
