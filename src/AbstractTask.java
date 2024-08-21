import java.util.Objects;

public abstract class AbstractTask {
    private String title;
    private String description;
    private int priority;
    private String status;
    static int taskCounter;
    final static String COMPLETED = "Выполнено";
    final static String UNFINISHED = "Не выполнено";

    public AbstractTask() {
        taskCounter++;
    }

    public AbstractTask(String title, String description, int priority, String status) {
        taskCounter++;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    static int getTaskCount() {
        return taskCounter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (Objects.equals(status, "Выполнено") || Objects.equals(status, "Не выполнено")) {
            this.status = status;
        }
        System.out.println("Error prop");
    }

    @Override
    public String toString() {
        return "AbstractTask{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }
}
