package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers: ");
        String input = scanner.nextLine();

        String[] numberStrings = input.split(" ");
        for (String numberString : numberStrings) {
            int number = Integer.parseInt(numberString);
            numbers.add(number);
        }

        Collections.sort(numbers);

        System.out.print("Sorted list: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

