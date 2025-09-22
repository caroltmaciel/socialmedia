package br.com.github.caroltmaciel.socialmedia.repository;

import br.com.github.caroltmaciel.socialmedia.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

}
