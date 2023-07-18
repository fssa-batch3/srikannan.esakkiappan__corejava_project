package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class EmployeesList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = 3;
		HashMap<String, ArrayList<String>> countMap = new HashMap<String, ArrayList<String>>();
		System.out.println("Enter min " + num + " details :");
		while (count < num) {
			String s = sc.nextLine();
			String[] ar = s.split(",");
			int check = 0;
			for (String deptName : countMap.keySet()) {
				if (ar[0].equals(deptName)) {
					check = 1;
				}
			}
			if (check == 1) {
				ArrayList<String> arr = countMap.get(ar[0]);
				arr.add(ar[1]);
				countMap.put(ar[0], arr);
			}
			else {
				ArrayList<String> arr = new ArrayList<String>();
				arr.add(ar[1]);
				countMap.put(ar[0], arr);
			}
			count++;
		}
		for (String n : countMap.keySet()) {
			System.out.print(n+":");
			for(int i = 0;i<countMap.get(n).size();i++) {
				System.out.print(countMap.get(n).get(i) +",");
			}	
			System.out.println();
		}
	}
}