package com.throughapinhole.photoportfolio;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PhotoPortfolioController {
    @GetMapping("/")
    public String index() {
        return "Hello!";
    }
}
