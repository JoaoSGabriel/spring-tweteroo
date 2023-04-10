package api.rest.tweeteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import api.rest.tweeteroo.models.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long>{
    
}
