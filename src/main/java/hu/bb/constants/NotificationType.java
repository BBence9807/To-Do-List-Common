package hu.bb.constants;

public enum NotificationType {

    EMAIL("email"),
    SMS("sms"),
    PUSH("push");

    private String type;
 
    NotificationType(String type) {
        this.type = type;
    }
 
    public String getType() {
        return type;
    }
}
