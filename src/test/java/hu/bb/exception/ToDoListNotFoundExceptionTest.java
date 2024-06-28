package hu.bb.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hu.bb.constants.ToDoListExceptionPrefix;

class ToDoListNotFoundExceptionTest {
    
    @Test
    void testGetMessage() {
        ToDoListNotFoundException exception = new ToDoListNotFoundException("Not Found");
        assertTrue(exception.getMessage().contains(ToDoListExceptionPrefix.TODO_LIST_NOT_FOUND.getPrefix()));
    }
}
