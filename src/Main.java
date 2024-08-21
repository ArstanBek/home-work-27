//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SimpleTask simpleTask1 = new SimpleTask("task 1", "task desc", 5, AbstractTask.COMPLETED);
        SimpleTask simpleTask2 = new SimpleTask("task 2", "task desc", 1, AbstractTask.UNFINISHED);
        SimpleTask simpleTask3 = new SimpleTask("task 3", "task desc", 10, AbstractTask.UNFINISHED);

        // init ComplexTask with 2 subtasks
        ComplexTask complexTask1 = new ComplexTask(
                "complexTask1 1",
                "task descr", 2,
                AbstractTask.UNFINISHED,
                new SimpleTask[]{simpleTask1, simpleTask2}
        );

        // add subtask
        complexTask1.addSubTask(simpleTask3);

        // make all subtasks status COMPLETED
        complexTask1.setAllSubTasksStatus(AbstractTask.COMPLETED);


        System.out.println(simpleTask1.toString());
        System.out.println(simpleTask2.toString());
        System.out.println(simpleTask3.toString());
        System.out.println(complexTask1.toString());
        System.out.println("All task count = " + AbstractTask.getTaskCount());
    }
}