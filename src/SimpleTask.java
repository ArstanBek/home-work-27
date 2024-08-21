public class SimpleTask extends AbstractTask {
    public SimpleTask() {
    }

    public SimpleTask(String title, String description, int priority, String status) {
        super(title, description, priority, status);
    }

    @Override
    public String toString() {
        return "SimpleTask{" +
                "title='" + super.getTitle() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", priority=" + super.getPriority() +
                ", status='" + super.getStatus() + '\'' +
                '}';
    }
}
