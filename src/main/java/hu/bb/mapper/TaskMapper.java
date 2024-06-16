package hu.bb.mapper;

import hu.bb.dto.TaskDTO;
import hu.bb.entity.Task;

public interface TaskMapper {

    public Task toTask(TaskDTO taskDTO);
    public TaskDTO toTaskDto(Task task);
}
