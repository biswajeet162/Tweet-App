package com.tweetapp.repository;

import com.tweetapp.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    @Query(value = "SELECT * FROM usertimeline_likes WHERE tweet_id = :tweetId", nativeQuery = true)
    List<Like> findByTweetId(Long tweetId);
}
