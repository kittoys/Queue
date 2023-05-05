import java.util.LinkedList;
import java.util.Queue;

public class TodoList {
    private Queue<String> tasks;

    public TodoList() {
        tasks = new LinkedList<>();
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public String completeTask() {
        return tasks.poll();
    }

    public void viewList() {
        System.out.println("Todo List Rutinitas Kegiatan Sehari-hari:");
        System.out.println(tasks);
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        // Menambahkan rutinitas kegiatan sehari-hari ke todo list
        todoList.addTask("Bangun tidur");
        todoList.addTask("Mandi pagi");
        todoList.addTask("Sarapan pagi");
        todoList.addTask("Bekerja");
        todoList.addTask("Makan siang");
        todoList.addTask("Istirahat");
        todoList.addTask("Bekerja lagi");
        todoList.addTask("Belajar");
        todoList.addTask("Makan malam");
        todoList.addTask("Istirahat sejenak");
        todoList.addTask("Beribadah");
        todoList.addTask("Tidur");

        // Melihat todo list
        todoList.viewList();

        // Menyelesaikan rutinitas kegiatan yang sudah dilakukan
        System.out.println("Kegiatan yang sudah dilakukan:");
        System.out.println(todoList.completeTask());
        System.out.println(todoList.completeTask());
        System.out.println(todoList.completeTask());

        // Melihat todo list yang belum selesai
        System.out.println("Todo List Rutinitas Kegiatan yang Belum Selesai:");
        todoList.viewList();
    }
}
