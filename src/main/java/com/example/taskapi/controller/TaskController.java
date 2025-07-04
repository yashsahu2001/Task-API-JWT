package com.example.taskapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskapi.entity.Task;
import com.example.taskapi.entity.User;
import com.example.taskapi.repository.TaskRepository;
import com.example.taskapi.repository.UserRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskRepository taskRepo;

    @Autowired
    private UserRepository userRepo;

    @GetMapping
    public List<Task> getTasks(Authentication auth) {
        User user = userRepo.findByUsername(auth.getName()).get();
        return taskRepo.findByUser(user);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task, Authentication auth) {
        User user = userRepo.findByUsername(auth.getName()).get();
        task.setUser(user);
        return taskRepo.save(task);
    }
}