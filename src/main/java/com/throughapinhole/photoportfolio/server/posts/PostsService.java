package com.throughapinhole.photoportfolio.server.posts;

import com.throughapinhole.photoportfolio.entities.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostsService {
    @Autowired private PostsRepository postsRepository;

    public List<Post> findAll() {
        return postsRepository.findAll();
    }

    public Post findById(long id) {
        var post = postsRepository.findById(id);
        if (post.isPresent()) {
            return post.get();
        }
        return null;
    }

    public Post createPost(Post post) {
        return postsRepository.save(post);
    }

    // TODO: Add logic for accepting a partial post, find the original, merge them, and then save
    public Post updatePost(Post post) {
        return postsRepository.save(post);
    }

    public Post deleteById(long id) {
        var post = postsRepository.deleteById(id);
        if (post.isPresent()) {
            return post.get();
        }
        return null;
    }
}
