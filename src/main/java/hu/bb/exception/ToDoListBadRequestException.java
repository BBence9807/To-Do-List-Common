package hu.bb.exception;

import hu.bb.constants.ToDoListExceptionPrefix;

public class ToDoListBadRequestException extends Exception {

    public ToDoListBadRequestException(String message) {
        super(ToDoListExceptionPrefix.TODO_LIST_BAD_REQUEST.getPrefix()+message);
    }
}
