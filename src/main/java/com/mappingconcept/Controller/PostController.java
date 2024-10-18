package com.mappingconcept.Controller;

import com.mappingconcept.Service.PostService;
import com.mappingconcept.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")

public class PostController {
    @Autowired
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        Post post1 = postService.createPost(post);
        return new ResponseEntity<>(post1, HttpStatus.CREATED);
    }
}
