package com.bd.HibernateDemo.controllers;
import com.bd.HibernateDemo.models.Post;
import com.bd.HibernateDemo.services.PostService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("posts/{id}")
    public Optional<Post> getPostById(@PathVariable Integer id) {
        return postService.getPostById(id);
    }

}
