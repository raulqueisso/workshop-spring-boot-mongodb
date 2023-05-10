package com.raulfelix.workshopmongo.services;

import com.raulfelix.workshopmongo.domain.Post;
import com.raulfelix.workshopmongo.domain.User;
import com.raulfelix.workshopmongo.dto.UserDTO;
import com.raulfelix.workshopmongo.repositories.PostRepository;
import com.raulfelix.workshopmongo.repositories.UserRepository;
import com.raulfelix.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}