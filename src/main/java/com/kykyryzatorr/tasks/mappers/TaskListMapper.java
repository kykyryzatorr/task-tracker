package com.kykyryzatorr.tasks.mappers;

import com.kykyryzatorr.tasks.domain.dto.TaskListDto;
import com.kykyryzatorr.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);

}
