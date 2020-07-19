package me.iiaii.oauth2withentities.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {



    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
