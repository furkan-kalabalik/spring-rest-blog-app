package com.fk97.springrestblogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fk97.springrestblogapp.entity.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
