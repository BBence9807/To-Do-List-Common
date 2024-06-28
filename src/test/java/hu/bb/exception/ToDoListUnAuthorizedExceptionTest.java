package hu.bb.exception;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hu.bb.constants.ToDoListExceptionPrefix;

class ToDoListUnAuthorizedExceptionTest {
    
    @Test
    void testGetMessage() {
        ToDoListUnAuthorizedException exception = new ToDoListUnAuthorizedException("UnAuthorized");
        assertTrue(exception.getMessage().contains(ToDoListExceptionPrefix.TODO_LIST_UNAUTHORIZED.getPrefix()));
    }
}
