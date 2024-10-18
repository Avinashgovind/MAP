package com.mappingconcept.Service;

import com.mappingconcept.Repository.PostRepository;
import com.mappingconcept.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpls implements PostService {

@Autowired
private PostRepository postRepository;

    public PostServiceImpls(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public Post createPost(Post post) {
        Post save = postRepository.save(post);
        return save;
    }
}
