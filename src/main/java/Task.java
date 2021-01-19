public class Task {
    protected String description;
    protected boolean isDone;
    protected String type;

    public Task(String description, String type) {
        this.description = description;
        this.isDone = false;
        this.type = type;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : " "); //return tick or X symbols
    }

    public String getDescription() {
        return this.description;
    }

    public void toggleStatus() {
        this.isDone = !this.isDone;
    }

    public String getType() {
        return this.type;
    }

}