package com.throughapinhole.photoportfolio.server.posts;

import com.throughapinhole.photoportfolio.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired private PostsService postsService;

    @GetMapping(path = "posts", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Iterable<Post>> getPosts() {
        return new ResponseEntity<Iterable<Post>>(postsService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "posts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Post> getPost(@PathVariable("id") long id) {
        var post = postsService.findById(id);

        if (post == null) {
            return new ResponseEntity<Post>((Post) null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }

    @PostMapping(
            path = "posts",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Post> create(@RequestBody Post newPost) {
        var post = postsService.createPost(newPost);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }

    @PutMapping(path = "posts/{id}")
    public ResponseEntity<Post> update(@PathVariable("id") long id, @RequestBody Post postDetails) {
        var post = postsService.updatePost(postDetails);
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }

    @DeleteMapping(path = "posts/{id}")
    public ResponseEntity<Post> delete(@PathVariable("id") long id) {
        var post = postsService.deleteById(id);

        if (post == null) {
            return new ResponseEntity<Post>((Post) null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }
}
