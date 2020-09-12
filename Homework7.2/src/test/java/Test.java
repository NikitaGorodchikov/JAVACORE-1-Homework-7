import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Test {

    @org.junit.jupiter.api.Test
    public void testNewTask() {
        String testInput = "task_1";
        Main.newTask(testInput);
        assertThat(Main.listOfTasks, hasItems(testInput));
    }

    @org.junit.jupiter.api.Test
    public void testDeleteTask() {
        String task = "task_1";
       Main.listOfTasks.add(task);
       assertThat(Main.deleteTask(1), is(task));
    }

    @org.junit.jupiter.api.Test
    public void testEditTask() {
        String oldTask = "task";
        Main.listOfTasks.add(oldTask);
        int index = 1;
        String newTask = "newTask";
        assertThat(Main.editTask(index, newTask), is(oldTask));
    }

    @org.junit.jupiter.api.Test
    public void testDeleteAll() {
        Main.listOfTasks.add("task_1");
        assertThat(Main.deleteAll(), is(true));
    }
}
