package it.fiani.facciaLibro.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.fiani.facciaLibro.entity.Post;
import it.fiani.facciaLibro.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;

	public List<Post> mostraListaPost() {
		return (List<Post>) postRepository.findAll();

	}

	public void salva(Post post) {
		post.setInstanteCreazione(LocalDateTime.now());
		post.setInstanteCreazione(LocalDateTime.now());
		postRepository.save(post);

	}

	public void cancellaPost(Long id) {
		postRepository.deleteById(id);

	}

	public Post cercaPostPerId(Long id) {
		return postRepository.findById(id).get();

	}

	public Long numeroPost() {
		return postRepository.count();

	}

}
