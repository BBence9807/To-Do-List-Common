package hu.bb.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hu.bb.constants.ToDoListExceptionPrefix;

class ToDoListValidationExceptionTest {
    
    @Test
    void testGetMessage() {
        ToDoListValidationException exception = new ToDoListValidationException("Validation error");
        assertTrue(exception.getMessage().contains(ToDoListExceptionPrefix.TODO_LIST_VALIDATION.getPrefix()));
    }
}
