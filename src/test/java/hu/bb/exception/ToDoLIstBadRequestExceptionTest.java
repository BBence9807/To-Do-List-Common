package hu.bb.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hu.bb.constants.ToDoListExceptionPrefix;

class ToDoLIstBadRequestExceptionTest {
    
    @Test
    void testGetMessage() {
        ToDoListBadRequestException exception = new ToDoListBadRequestException("Bad Request");
        assertTrue(exception.getMessage().contains(ToDoListExceptionPrefix.TODO_LIST_BAD_REQUEST.getPrefix()));
    }
}
