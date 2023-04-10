package api.rest.tweeteroo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import api.rest.tweeteroo.dtos.AccountDTO;
import api.rest.tweeteroo.models.Account;
import api.rest.tweeteroo.repositories.AccountRepository;

@Service
public class AccountService {
    
    @Autowired
    private AccountRepository repository;

    public void create(@RequestBody AccountDTO dto) {
        repository.save(new Account(dto));
    }

    public Account getLoggedUser(String name) {
        return repository.findByusername(name);
    }
}
