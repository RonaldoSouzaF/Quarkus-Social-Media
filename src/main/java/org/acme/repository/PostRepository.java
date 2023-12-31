package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Post;

@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {
}
