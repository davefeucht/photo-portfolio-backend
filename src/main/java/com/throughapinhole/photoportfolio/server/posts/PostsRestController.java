package com.throughapinhole.photoportfolio.server.posts;
import com.throughapinhole.photoportfolio.entities.Post;
import com.throughapinhole.photoportfolio.utils.Utils.EntityType;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsRestController {
    @GetMapping(path = "posts", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<ArrayList<Post>> getPosts() {
            /* TODO: Create PostService to interact with the DB */
            Post post1 = new Post(EntityType.POST, "Some Title", "Some content that is longer than a title", 22);
            Post post2 = new Post(EntityType.POST, "Some Other Title", "Some other content that is longer than a title", 22);
            ArrayList<Post> posts = new ArrayList<Post>(
                Arrays.asList(post1, post2)
            );

            return new ResponseEntity<ArrayList<Post>>(posts, HttpStatus.OK);
        }

    @GetMapping(path = "posts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<ArrayList<Post>> getPost(@PathVariable("id") long id) {
            /* TODO: Create PostService to interact with the DB */
            Post post1 = new Post(EntityType.POST, "Some Title", "Some content that is longer than a title", 22);
            ArrayList<Post> posts = new ArrayList<Post>(
                Arrays.asList(post1)
            );

            return new ResponseEntity<ArrayList<Post>>(posts, HttpStatus.OK);
        }

    @PostMapping(
        path = "posts",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Post> create(@RequestBody Post newPost) {
        /* TODO: Create PostService to interact with the DB */
        return new ResponseEntity<Post>(newPost, HttpStatus.CREATED);
    }

    @PutMapping(path = "posts/{id}")
    public ResponseEntity<Post> update(@PathVariable("id") long id, @RequestBody Post postDetails) {
        /* TODO: Create PostService to interact with the DB */
        return new ResponseEntity<Post>(postDetails, HttpStatus.OK);
    }

    @DeleteMapping(path = "posts/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        /* TODO: Create PostService to interact with the DB */
        return new ResponseEntity<>("Post deleted successfully.", HttpStatus.OK);
    }
}
