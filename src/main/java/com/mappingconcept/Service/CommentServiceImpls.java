package com.mappingconcept.Service;

import com.mappingconcept.Repository.CommentRepository;
import com.mappingconcept.Repository.PostRepository;
import com.mappingconcept.entity.Comment;
import com.mappingconcept.entity.Post;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpls implements CommentService{
    private CommentRepository commentRepository;
    private PostRepository postRepository;
    public CommentServiceImpls(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }


    @Override
    public Comment createComment(Comment comment, long postId) {
        Post post = postRepository.findById(postId).get();
        comment.setPost(post);
        Comment save = commentRepository.save(comment);
        return save;
    }
}
