package hu.bb.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import hu.bb.constants.TaskPriority;

class TaskTest {
    
    
    @Test
    void testTask() {
        
        String title = "TestTask";
        Date date = new Date();

        Task task = new Task();

        task.setId(new UUID(1, 1));
        task.setComplated(false);
        task.setDescription("TestTaskDesc");
        task.setTitle(title);
        task.setPriority(TaskPriority.HIGH.getPriority());
        task.setCreatedAt(date);
        task.setUpdatedAt(date);
        task.setDueDate(date);
        task.setUserId("ou=Test");

        assertEquals(title, task.getTitle());
        assertEquals(date, task.getCreatedAt());
        assertEquals(date, task.getUpdatedAt());
    }
}
