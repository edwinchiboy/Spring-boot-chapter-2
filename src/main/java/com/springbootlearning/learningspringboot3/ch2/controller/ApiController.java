package com.springbootlearning.learningspringboot3.ch2.controller;

import com.springbootlearning.learningspringboot3.ch2.model.Video;
import org.springframework.web.bind.annotation.*;
import com.springbootlearning.learningspringboot3.ch2.service.VideoService;

import java.util.List;

@RestController

public class ApiController {
    private final VideoService videoService;

    public ApiController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/api/videos")
    public List<Video> all() {
        return videoService.getVideos();
    }

    @PostMapping("/api/videos")
    public Video newVideo(@RequestBody Video newVideo) {
        return videoService.create(newVideo);
    }
}
