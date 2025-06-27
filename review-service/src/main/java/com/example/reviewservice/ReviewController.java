package com.example.reviewservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @GetMapping
    public String getReviews() {
        return "List of Reviews from Review Service";
    }
}
