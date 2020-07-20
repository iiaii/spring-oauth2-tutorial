package me.iiaii.oauth2withentities.repository;

import me.iiaii.oauth2withentities.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
