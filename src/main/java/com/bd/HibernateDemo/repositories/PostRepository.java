package com.bd.HibernateDemo.repositories;

import com.bd.HibernateDemo.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
}
