package day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

	public static boolean myArray(List<String> cityList) throws IllegalArgumentException {

		if (cityList == null) {
			throw new IllegalArgumentException("ArrayList Cannot be Null");
		}

		List<String> output = new ArrayList<String>();

		for (int i = 0; i < cityList.size(); i++) {

			int ListCount = 0;

			for (int j = 0; j < output.size(); j++) {

				if (cityList.get(i).equals(output.get(j))) {
					ListCount += 1;

				}
				
			}

			if (ListCount < 1) {
				output.add(cityList.get(i));
			}
		}
		
		return true;

	}

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		List<String> uniqueCityList = new ArrayList<>(new HashSet<>(cityList));
		for (String city : uniqueCityList) {
			System.out.println(city);
		}

	}
}

