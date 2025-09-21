package br.com.github.caroltmaciel.socialmedia.services;

import br.com.github.caroltmaciel.socialmedia.domain.User;
import br.com.github.caroltmaciel.socialmedia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
