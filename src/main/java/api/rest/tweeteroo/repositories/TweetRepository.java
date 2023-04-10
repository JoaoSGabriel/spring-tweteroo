package api.rest.tweeteroo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import api.rest.tweeteroo.models.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long>{
    public Optional<Tweet> findAllByusername(String username);
}
