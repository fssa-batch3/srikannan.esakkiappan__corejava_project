package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class SortedTask {
    private int id;
    private String name;
    private LocalDate deadline;
    private String priority;

    public SortedTask(int id, String name, LocalDate deadline, String priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
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

    public String getPriority() {
        return priority;
    }
}

public class SortTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SortedTask> tasks = new ArrayList<>();

        System.out.println("Enter tasks (id, name, deadline, priority):");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] taskInfo = input.split(",");
            int id = Integer.parseInt(taskInfo[0].trim());
            String name = taskInfo[1].trim();
            LocalDate deadline = LocalDate.parse(taskInfo[2].trim());
            String priority = taskInfo[3].trim();

            SortedTask task = new SortedTask(id, name, deadline, priority);
            tasks.add(task);
        }

        
        tasks.sort(Comparator.comparing(SortedTask::getDeadline).thenComparing(SortedTask::getPriority));

        System.out.println("Sorted tasks by deadline and priority:");
        for (SortedTask task : tasks) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline() + "," + task.getPriority());
        }
        scanner.close();
    }
}

