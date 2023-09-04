package com.example.BlogSpring.repo;

import com.example.BlogSpring.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
