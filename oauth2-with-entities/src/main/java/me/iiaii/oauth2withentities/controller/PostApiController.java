package me.iiaii.oauth2withentities.controller;

import lombok.RequiredArgsConstructor;
import me.iiaii.oauth2withentities.domain.dto.PostsResponseDto;
import me.iiaii.oauth2withentities.domain.dto.PostsSaveRequestDto;
import me.iiaii.oauth2withentities.domain.dto.PostsUpdateRequestDto;
import me.iiaii.oauth2withentities.service.PostService;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostService postService;


    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody
            PostsUpdateRequestDto requestDto) {

        return postService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id) {
        return postService.findById(id);
    }
}
