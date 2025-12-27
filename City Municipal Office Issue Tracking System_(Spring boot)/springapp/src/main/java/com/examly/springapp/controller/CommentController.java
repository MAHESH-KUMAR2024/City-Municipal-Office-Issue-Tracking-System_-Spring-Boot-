package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @GetMapping("/{id}")
    public String getComment(@PathVariable Long id) {
        return "Comment " + id;
    }

    @PostMapping
    public void createComment() {}
}
