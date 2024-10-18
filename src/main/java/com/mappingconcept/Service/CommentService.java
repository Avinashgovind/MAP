package com.mappingconcept.Service;

import com.mappingconcept.entity.Comment;

public interface CommentService {
    public Comment createComment(Comment comment, long postId);
}
