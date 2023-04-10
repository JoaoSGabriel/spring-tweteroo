package api.rest.tweeteroo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import api.rest.tweeteroo.models.Account;
import api.rest.tweeteroo.models.Tweet;
import api.rest.tweeteroo.services.AccountService;
import api.rest.tweeteroo.services.TweetService;

@RestController
@RequestMapping("/api/tweet")
public class TweetController {
    
    @Autowired
    private TweetService tweetService;
    private AccountService accountService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createNewTweet(@RequestBody String req) {
        Account user = accountService.getLoggedUser(req);
    }

    @GetMapping
    public List<Tweet> getAll() {
        return tweetService.getAll();
    }
}