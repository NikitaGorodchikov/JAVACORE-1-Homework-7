import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    public void testNewTask() {
        String testInput = "task_1";
        Assertions.assertTrue(Main.newTask(testInput));
    }

    @org.junit.jupiter.api.Test
    public void testDeleteTask() {
       Main.listOfTasks.add("testTask");
       Assertions.assertEquals(Main.deleteTask(1), "testTask");
    }

    @org.junit.jupiter.api.Test
    public void testChangeTask() {
        Main.listOfTasks.add("task");
        int index = 1;
        String newTask = "newTask";
        Assertions.assertTrue(Main.changeTask(index, newTask));
    }
}
