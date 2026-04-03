package com.kykyryzatorr.tasks.services.impl;

import com.kykyryzatorr.tasks.domain.entities.TaskList;
import com.kykyryzatorr.tasks.repositories.TaskListRepository;
import com.kykyryzatorr.tasks.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
