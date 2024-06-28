package hu.bb.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import hu.bb.constants.TaskPriority;

class TaskDTOTest {
    
    @Test
    void testCreateTaskDTO() {
        String title = "Test";

        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setId(new UUID(1, 1));
        taskDTO.setComplated(false);
        taskDTO.setDescription("TestTaskDTODesc");
        taskDTO.setTitle(title);
        taskDTO.setDueDate(new Date());
        taskDTO.setPriority(TaskPriority.MEDIUM.getPriority());
        taskDTO.setUserId("ou=Test");
        
        assertEquals(title,taskDTO.getTitle());
    }
}
