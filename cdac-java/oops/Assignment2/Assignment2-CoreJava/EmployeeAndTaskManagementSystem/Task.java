public abstract class Task {
    private String taskName;
    private String description;

    public Task(String taskName, String description) {
        this.taskName = taskName;
        this.description = description;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void trackProgress();
}