package day08.misc;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
	public static void main(String[] args) {
		
		Map<String,Integer> countMap = new HashMap<String,Integer>();
		
		String[] a = {
				"Prathiusha","Naresh","Prathiusha","Vishali","Nithilan","Prathiusha","Vishali"
		};
		
		for(int i = 0;i<a.length;i++) {
			if(countMap.get(a[i])==null) {
				countMap.put(a[i], 1);
			}
			else {
				int count = countMap.get(a[i]);
				count++;
				countMap.put(a[i],count);
				System.out.println(count);
				
			}
		}
		System.out.println(countMap);
	}
}
