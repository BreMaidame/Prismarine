package com.prismarine_core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prismarine_core.posts.Post;
import com.prismarine_core.posts.PostRepository;
import com.prismarine_core.posts.PostRequestDto;
import com.prismarine_core.posts.PostResponseDto;

@RestController
@RequestMapping("posts")
// Post endpoint
public class PostController {

    @Autowired
    private PostRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void createPost(@RequestBody PostRequestDto data) {
        Post postData = new Post(data);
        repository.save(postData);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    // Method for reading all database records
    public List<PostResponseDto> getAll() {
        // Instantiates a new object return list.
        List<PostResponseDto> postsList = repository.findAll()
                .stream().map(PostResponseDto::new).toList();
        // Returns the list from database
        return postsList;

    }
}
