package hu.bb.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hu.bb.constants.ToDoListExceptionPrefix;

class ToDoListInternalServerErrorExceptionTest {
    
    @Test
    void testGetMessage() {
        ToDoListInternalServerErrorException exception = new ToDoListInternalServerErrorException("Internal Server Error");
        assertTrue(exception.getMessage().contains(ToDoListExceptionPrefix.TODO_LIST_INTERNAL_SERVER_ERROR.getPrefix()));
    }
}
