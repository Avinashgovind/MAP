package com.mappingconcept.Controller;

import com.mappingconcept.Service.CommentService;
import com.mappingconcept.Service.PostService;
import com.mappingconcept.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;


    public CommentController(CommentService commentService) {
        this.commentService = commentService;

    }


    @PostMapping
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment, @RequestParam long postId) {
        Comment comment1 = commentService.createComment(comment, postId);
        return new ResponseEntity<>(comment1, HttpStatus.CREATED);
    }

}
