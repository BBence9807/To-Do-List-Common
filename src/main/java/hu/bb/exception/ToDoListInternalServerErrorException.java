package hu.bb.exception;

import hu.bb.constants.ToDoListExceptionPrefix;

public class ToDoListInternalServerErrorException extends Exception {

    public ToDoListInternalServerErrorException(String message) {
        super(ToDoListExceptionPrefix.TODO_LIST_INTERNAL_SERVER_ERROR.getPrefix()+message);
    }
}
