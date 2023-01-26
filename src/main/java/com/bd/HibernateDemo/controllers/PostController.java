package com.bd.HibernateDemo.controllers;
import com.bd.HibernateDemo.models.Post;
import com.bd.HibernateDemo.services.PostService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/posts/user/{id}/posts")
    public List<Post> GetPostByUser(@PathVariable Integer id) {
        return postService.getPostsByUser(id);
    }

    @PostMapping("/posts/addNew")
    public void AddPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @PutMapping("/posts/{id}/update")
    public void UpdatePost(@RequestBody Post post) {
        postService.updatePost(post);
    }

    @DeleteMapping("/posts/{id}/delete")
    public void DeletePost(@PathVariable Integer id) {
        postService.deletePost(id);
    }

}
