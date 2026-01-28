package com.student.progressmonitor.service;

import com.student.progressmonitor.entity.Progress;
import com.student.progressmonitor.repository.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressService {

    @Autowired
    private ProgressRepository progressRepository;

    public List<Progress> getProgressByUser(Long userId) {
        return progressRepository.findByUserId(userId);
    }

    public Progress saveProgress(Progress progress) {
        return progressRepository.save(progress);
    }

    public void deleteProgress(Long id) {
        progressRepository.deleteById(id);
    }
}
