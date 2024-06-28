package hu.bb.exception;

import hu.bb.constants.ToDoListExceptionPrefix;

public class ToDoListUnAuthorizedException extends Exception {

    public ToDoListUnAuthorizedException(String message) {
        super(ToDoListExceptionPrefix.TODO_LIST_UNAUTHORIZED.getPrefix()+message);
    }
}
