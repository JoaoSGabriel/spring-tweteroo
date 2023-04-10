package api.rest.tweeteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.rest.tweeteroo.models.Account;
import api.rest.tweeteroo.repositories.AccountRepository;

@Service
public class AccountService {
    
    @Autowired
    private AccountRepository repository;

    public void create(Account data) {
        repository.save(data);
    }

    public Account getLoggedUser(String name) {
        return repository.findByusername(name);
    }
}
