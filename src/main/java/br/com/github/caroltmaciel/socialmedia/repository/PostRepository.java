package br.com.github.caroltmaciel.socialmedia.repository;

import br.com.github.caroltmaciel.socialmedia.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
