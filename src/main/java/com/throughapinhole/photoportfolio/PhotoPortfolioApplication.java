package com.throughapinhole.photoportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.throughapinhole.photoportfolio.entities")
@EnableJpaRepositories(basePackages = "com.throughapinhole.photoportfolio.server")
public class PhotoPortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoPortfolioApplication.class, args);
    }
}
