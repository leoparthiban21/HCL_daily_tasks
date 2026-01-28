package com.student.progressmonitor.controller;

import com.student.progressmonitor.entity.Progress;
import com.student.progressmonitor.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {

    @Autowired
    private ProgressService progressService;

    @GetMapping("/user/{userId}")
    public List<Progress> getUserProgress(@PathVariable Long userId) {
        return progressService.getProgressByUser(userId);
    }

    @PostMapping
    public Progress addProgress(@RequestBody Progress progress) {
        return progressService.saveProgress(progress);
    }

    @DeleteMapping("/{id}")
    public void deleteProgress(@PathVariable Long id) {
        progressService.deleteProgress(id);
    }
}
