package me.iiaii.oauth2withentities.service;

import lombok.RequiredArgsConstructor;
import me.iiaii.oauth2withentities.domain.Posts;
import me.iiaii.oauth2withentities.domain.dto.PostsResponseDto;
import me.iiaii.oauth2withentities.domain.dto.PostsSaveRequestDto;
import me.iiaii.oauth2withentities.domain.dto.PostsUpdateRequestDto;
import me.iiaii.oauth2withentities.repository.PostsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+ id));

        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById (Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+ id));

        return new PostsResponseDto(entity);
    }
}
