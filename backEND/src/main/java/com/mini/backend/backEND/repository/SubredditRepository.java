package com.mini.backend.backEND.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mini.backend.backEND.model.Sub;

import java.util.Optional;

@Repository
public interface SubredditRepository extends JpaRepository<Sub, Long> {

    Optional<Sub> findByName(String subredditName);
}
