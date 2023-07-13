package day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
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

