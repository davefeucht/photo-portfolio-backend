package com.throughapinhole.photoportfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotoPortfolioController {
    @GetMapping("/")
    public String index() {
        return "Hello!";
    }
}
