package com.app.teamProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("feed/*")
public class FeedController {


    @GetMapping("create")
    public void create(){;}

    @GetMapping("feedList")
    public void feedList(){;}
}
