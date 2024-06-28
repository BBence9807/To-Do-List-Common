package hu.bb.exception;

import hu.bb.constants.ToDoListExceptionPrefix;

public class ToDoListValidationException extends Exception {

    public ToDoListValidationException(String message) {
        super(ToDoListExceptionPrefix.TODO_LIST_VALIDATION.getPrefix()+message);
    }
}
