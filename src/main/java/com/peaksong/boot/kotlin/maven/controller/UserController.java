package com.peaksong.boot.kotlin.maven.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.peaksong.boot.kotlin.maven.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping()
    public String user() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(new User("1", "peakSong"));
    }
}
