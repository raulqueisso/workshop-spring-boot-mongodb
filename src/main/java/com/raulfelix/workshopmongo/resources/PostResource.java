package com.raulfelix.workshopmongo.resources;

import com.raulfelix.workshopmongo.domain.Post;
import com.raulfelix.workshopmongo.domain.User;
import com.raulfelix.workshopmongo.dto.UserDTO;
import com.raulfelix.workshopmongo.services.PostService;
import com.raulfelix.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
