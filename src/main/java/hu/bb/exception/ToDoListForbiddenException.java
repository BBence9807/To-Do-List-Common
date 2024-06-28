package hu.bb.exception;

import hu.bb.constants.ToDoListExceptionPrefix;

public class ToDoListForbiddenException extends Exception {

    public ToDoListForbiddenException(String message) {
        super(ToDoListExceptionPrefix.TODO_LIST_FORBIDDEN.getPrefix()+message);
    }

}
