import java.util.Arrays;

public class ComplexTask extends AbstractTask{
    private AbstractTask[] subTasks;
    public ComplexTask() {
    }

    public ComplexTask(String title, String description, int priority, String status, AbstractTask[] subTasks) {
        super(title, description, priority, status);
        this.subTasks = subTasks;
    }

    public AbstractTask[] getSubTasks() {
        return this.subTasks;
    }

    public void setSubTasks(AbstractTask[] subTasks) {
        this.subTasks = subTasks;
    }

    public void addSubTask(AbstractTask subTask) {
        int currentSubTasksLength = this.subTasks.length;
        AbstractTask[] newSubTasks = new AbstractTask[currentSubTasksLength + 1];
        for (int i = 0; i < currentSubTasksLength; i++) {
            newSubTasks[i] = this.subTasks[i];
        }
        newSubTasks[currentSubTasksLength] = subTask;
        this.subTasks = newSubTasks;
    }

    public void setAllSubTasksStatus(String status) {
        for (int i = 0; i < this.subTasks.length; i++) {
            this.subTasks[i].setStatus(status);
        }
    }

    @Override
    public String toString() {
        return "ComplexTask{" +
                "title='" + super.getTitle() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", priority=" + super.getPriority() +
                ", status='" + super.getStatus() + '\'' +
                "subTasks=" + Arrays.toString(subTasks) +
                '}';
    }
}
