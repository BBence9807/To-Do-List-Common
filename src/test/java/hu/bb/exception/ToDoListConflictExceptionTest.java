package hu.bb.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hu.bb.constants.ToDoListExceptionPrefix;

class ToDoListConflictExceptionTest {
    
    @Test
    void testGetMessage() {
        ToDoListConflictException exception = new ToDoListConflictException("Conflict");
        assertTrue(exception.getMessage().contains(ToDoListExceptionPrefix.TODO_LIST_CONFLICT.getPrefix()));
    }
}
