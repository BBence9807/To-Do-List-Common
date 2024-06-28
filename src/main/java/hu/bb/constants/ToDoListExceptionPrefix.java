package hu.bb.constants;

public enum ToDoListExceptionPrefix {

    TODO_LIST_BAD_REQUEST("ToDoListBadRequestException: "),
    TODO_LIST_UNAUTHORIZED("ToDoListUnAuthorizedException: "),
    TODO_LIST_FORBIDDEN("ToDoListForbiddenException: "),
    TODO_LIST_NOT_FOUND("ToDoListNotFoundException: "),
    TODO_LIST_CONFLICT("ToDoListConflictException: "),
    TODO_LIST_INTERNAL_SERVER_ERROR("ToDoListInternalServerErrorException: "),
    TODO_LIST_VALIDATION("ToDoListValidationException: ");
    

    private String prefix;
 
    ToDoListExceptionPrefix(String prefix) {
        this.prefix = prefix;
    }
 
    public String getPrefix() {
        return prefix;
    }

}
