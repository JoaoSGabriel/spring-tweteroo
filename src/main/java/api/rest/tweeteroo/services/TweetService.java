package api.rest.tweeteroo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.tweeteroo.models.Tweet;
import api.rest.tweeteroo.repositories.TweetRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository tweetRepository;

    public void create(Tweet data) {
        tweetRepository.save(data);
    }

    public List<Tweet> getAll() {
        return tweetRepository.findAll();
    }
}
