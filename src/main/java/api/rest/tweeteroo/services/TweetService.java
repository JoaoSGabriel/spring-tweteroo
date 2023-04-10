package api.rest.tweeteroo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import api.rest.tweeteroo.dtos.TweetDTO;
import api.rest.tweeteroo.models.Tweet;
import api.rest.tweeteroo.repositories.TweetRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository tweetRepository;

    public void create(@RequestBody TweetDTO dto) {
        tweetRepository.save(new Tweet(dto));
    }

    public List<Tweet> getAll() {
        return tweetRepository.findAll();
    }
}
