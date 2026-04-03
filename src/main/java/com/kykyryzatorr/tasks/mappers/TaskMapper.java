package com.kykyryzatorr.tasks.mappers;

import com.kykyryzatorr.tasks.domain.dto.TaskDto;
import com.kykyryzatorr.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
