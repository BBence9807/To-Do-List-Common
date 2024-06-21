package hu.bb.constants;

public enum TaskPriority {

    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    private String priority;
 
    TaskPriority(String priority) {
        this.priority = priority;
    }
 
    public String getPriority() {
        return priority;
    }
}
