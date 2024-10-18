package com.mappingconcept.Repository;

import com.mappingconcept.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}