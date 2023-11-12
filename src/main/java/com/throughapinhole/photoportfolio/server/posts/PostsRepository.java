package com.throughapinhole.photoportfolio.server.posts;

import com.throughapinhole.photoportfolio.entities.Post;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepository extends CrudRepository<Post, Long> {
    List<Post> findAll();

    Optional<Post> findById(long id);

    Optional<Post> deleteById(long id);
}
