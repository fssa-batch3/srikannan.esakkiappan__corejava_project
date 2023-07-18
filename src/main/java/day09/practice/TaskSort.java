package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Task {
    private int id;
    private String name;
    private LocalDate deadline;

    public Task(int id, String name, LocalDate deadline2) {
        this.id = id;
        this.name = name;
        
//        LocalDate localDate = LocalDate.parse(deadline2);
        this.deadline = deadline2;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
}

public class TaskSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        System.out.println("Enter tasks (id, name, deadline):");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] taskInfo = input.split(",");
            int id = Integer.parseInt(taskInfo[0].trim());
            String name = taskInfo[1].trim();
            LocalDate deadline = LocalDate.parse(taskInfo[2].trim());
//
            Task task = new Task(id, name, deadline);
            tasks.add(task);
        }
        tasks.sort(Comparator.comparing(Task::getDeadline));


        System.out.println("Sorted tasks by deadline:");
        for (Task task : tasks) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
        }
        scanner.close();
    }
}

