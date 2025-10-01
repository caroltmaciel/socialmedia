package br.com.github.caroltmaciel.socialmedia.services;

import br.com.github.caroltmaciel.socialmedia.domain.Post;
import br.com.github.caroltmaciel.socialmedia.repository.PostRepository;
import br.com.github.caroltmaciel.socialmedia.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private static final String POST_NAO_ENCONTRADO = "Post não encontrado";

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id)
            .orElseThrow(() -> new ObjectNotFoundException(POST_NAO_ENCONTRADO));
    }
}