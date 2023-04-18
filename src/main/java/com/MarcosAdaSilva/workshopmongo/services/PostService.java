package com.MarcosAdaSilva.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MarcosAdaSilva.workshopmongo.domain.Post;
import com.MarcosAdaSilva.workshopmongo.repository.PostRepository;
import com.MarcosAdaSilva.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));

     }
	
	public List<Post> finfByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}

}
