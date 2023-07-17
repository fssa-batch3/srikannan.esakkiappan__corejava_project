package day08.practice;

import java.util.*;

public class CommaSeparatedNameHashMap {
	public static void main(String[] args) {
		String[] s = { "Ram", "Ram", "Superman", "Spider", "hey", "hello", "hey", "Spider" };
		Map<String, Integer> nameMap = countNames(s);

		for (String names : nameMap.keySet()) {
			Integer count = nameMap.get(names);
			System.out.println(names + ": " + count);
		}
	}

	public static Map<String, Integer> countNames(String[] namesArray) {
		Map<String, Integer> nameMap = new TreeMap<>();

		for (String name : namesArray) {
			nameMap.put(name, nameMap.getOrDefault(name, 0) + 1);
		}

		return nameMap;
	}
}