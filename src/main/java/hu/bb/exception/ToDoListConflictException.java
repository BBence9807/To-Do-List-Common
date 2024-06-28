package hu.bb.exception;

import hu.bb.constants.ToDoListExceptionPrefix;

public class ToDoListConflictException extends Exception {

     public ToDoListConflictException(String message) {
        super(ToDoListExceptionPrefix.TODO_LIST_CONFLICT.getPrefix()+message);
    }

}
