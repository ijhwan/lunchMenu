package com.lunchMenu.springboot.web;

import com.lunchMenu.springboot.service.posts.PostsService;
import com.lunchMenu.springboot.web.dto.PostResponseDto;
import com.lunchMenu.springboot.web.dto.PostsSaveRequestDto;
import com.lunchMenu.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService prostsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return prostsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return prostsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostResponseDto findById(@PathVariable Long id) {
        return prostsService.findById(id);
    }


}
