package com.example.taskapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskapi.entity.Task;
import com.example.taskapi.entity.User;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}