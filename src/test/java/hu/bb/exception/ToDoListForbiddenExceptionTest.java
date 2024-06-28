package hu.bb.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hu.bb.constants.ToDoListExceptionPrefix;

class ToDoListForbiddenExceptionTest {
    
    @Test
    void testGetMessage() {
        ToDoListForbiddenException exception = new ToDoListForbiddenException("Forbidden");
        assertTrue(exception.getMessage().contains(ToDoListExceptionPrefix.TODO_LIST_FORBIDDEN.getPrefix()));
    }
}
