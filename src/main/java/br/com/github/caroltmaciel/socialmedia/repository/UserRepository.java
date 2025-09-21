package br.com.github.caroltmaciel.socialmedia.repository;

import br.com.github.caroltmaciel.socialmedia.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;

public interface UserRepository extends MongoRepository<User, String> {

}
