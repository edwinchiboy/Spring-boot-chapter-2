package com.springbootlearning.learningspringboot3.ch2.controller;

import com.springbootlearning.learningspringboot3.ch2.model.Video;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.springbootlearning.learningspringboot3.ch2.service.VideoService;

@Controller
public class HomeController {


    private final VideoService videoService;

    public HomeController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("videos", videoService.getVideos());
        return "index";
    }

    @PostMapping("/new-video")
    public String newVideo (@ModelAttribute Video newVideo){
        videoService.create(newVideo);
        return "redirect:/";
    }

}
