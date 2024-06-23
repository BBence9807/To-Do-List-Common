package hu.bb;

import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hu.bb.constants.TaskPriority;
import hu.bb.dto.TaskDTO;
import hu.bb.entity.Task;
import hu.bb.mapper.TaskMapperImpl;

class TaskMapperImplTest {

    TaskMapperImpl taskMapperImpl ;
    TaskDTO  taskDTO;
    Task task;

    @BeforeEach
    public void init(){
        taskMapperImpl = new TaskMapperImpl();
        task = this.createTask();
        taskDTO = this.createTaskDTO();
    }

    @AfterEach
    public void tearDown(){
        taskMapperImpl = null;
    }


    private Task createTask(){
        return Task.builder()
            .id(new UUID(1, 1))
            .complated(false)
            .description("TestTaskDesc")
            .title("TestTask")
            .dueDate(new Date())
            .priority(TaskPriority.HIGH.getPriority())
            .createdAt(new Date())
            .updatedAt(new Date())
            .build();
    }

    private TaskDTO createTaskDTO(){
        return TaskDTO.builder()
                .id(new UUID(1, 1))
                .complated(false)
                .description("TestTaskDTODesc")
                .title("TestTaskDTO")
                .dueDate(new Date())
                .priority(TaskPriority.MEDIUM.getPriority())
                .build();
    }

    @Test
    void toUserTest(){
      
    }

    @Test
    void toUserDTOTest(){
       
    }

}
