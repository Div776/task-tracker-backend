package com.tasktracker.task_tracker.repository;

import com.tasktracker.task_tracker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}