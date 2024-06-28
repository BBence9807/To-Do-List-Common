package hu.bb.exception;

import hu.bb.constants.ToDoListExceptionPrefix;

public class ToDoListNotFoundException extends Exception {

    public ToDoListNotFoundException(String message) {
        super(ToDoListExceptionPrefix.TODO_LIST_NOT_FOUND.getPrefix()+message);
    }
}
