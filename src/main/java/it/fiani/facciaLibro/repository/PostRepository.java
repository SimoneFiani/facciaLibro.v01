package it.fiani.facciaLibro.repository;

import org.springframework.data.repository.CrudRepository;

import it.fiani.facciaLibro.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
