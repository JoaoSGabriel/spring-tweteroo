package api.rest.tweeteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import api.rest.tweeteroo.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
