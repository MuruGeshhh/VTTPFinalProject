package com.mini.backend.backEND.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mini.backend.backEND.model.Post;
import com.mini.backend.backEND.model.Sub;
import com.mini.backend.backEND.model.User;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Sub subreddit);

    List<Post> findByUser(User user);
}
