package hu.bb.mapper;

import org.springframework.stereotype.Component;

import hu.bb.dto.TaskDTO;
import hu.bb.entity.Task;

/**
 * Task Mapper class 
 */
@Component
public class TaskMapperImpl implements TaskMapper{

    /**
     * Convert TaskDTO to Task
     */
    @Override
    public Task toTask(TaskDTO taskDTO) {
        return Task.builder()
            .id(taskDTO.getId())
            .userId(taskDTO.getUserId())
            .title(taskDTO.getTitle())
            .description(taskDTO.getDescription())
            .priority(taskDTO.getPriority())
            .complated(taskDTO.getComplated())
            .dueDate(taskDTO.getDueDate())
            .build();
    }

    /**
     * Convert Task to TaskDTO
     */
    @Override
    public TaskDTO toTaskDto(Task task) {
        return TaskDTO.builder()
            .id(task.getId())
            .userId(task.getUserId())
            .title(task.getTitle())
            .description(task.getDescription())
            .priority(task.getPriority())
            .complated(task.getComplated())
            .dueDate(task.getDueDate())
            .build();
    }

}
