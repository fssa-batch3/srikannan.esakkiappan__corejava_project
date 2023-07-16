package day07.practice;

import java.util.*;

public class DuplicatNumber {
	public static void main(String[] args) throws Exception {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(7);
		removeDuplicateElements(arr);

	}

	public static void removeDuplicateElements(ArrayList<Integer> numbers) throws Exception {
		if (numbers == null) {
			throw new Exception("Array cannot be null");
		}
		
		HashSet<Integer> uniqueArr = new HashSet<Integer>(numbers);

		System.out.println("Using  Hasset to remove duplicates");
		for (Integer arr1 : uniqueArr) {
			System.out.print(arr1 + " ");

		}

	}

	public static boolean validateDuplicatemethod(ArrayList<Integer> numbers, HashSet<Integer> uniqueArr)
			throws Exception {
		HashSet<Integer> set = new HashSet<>(numbers);

		if (!set.equals(uniqueArr)) {
			throw new Exception("The array does not contain all unique elements.");

		}
		return true;

	}

}
