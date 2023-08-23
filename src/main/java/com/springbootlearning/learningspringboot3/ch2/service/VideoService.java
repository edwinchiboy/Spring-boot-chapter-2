package com.springbootlearning.learningspringboot3.ch2.service;

import com.springbootlearning.learningspringboot3.ch2.model.Video;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    private List<Video> videos = List.of(new Video("Need Help with your spring Boot 3 APP?"),
            new Video("Dont do This to your own code"),
            new Video("SECRETS to fix BROKEN CODES"));

    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video newVideo) {
        List<Video> extend = new ArrayList<>(videos);
        extend.add(newVideo);
        this.videos = List.copyOf(extend);
        return newVideo;
    }
}
