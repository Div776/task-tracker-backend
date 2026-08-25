package com.tasktracker.task_tracker.repository;

import com.tasktracker.task_tracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}