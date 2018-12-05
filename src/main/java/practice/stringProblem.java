package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//Yaay !!

public class stringProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		Map<Character, Integer> valueMap = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> evenMap = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> oddMap = new LinkedHashMap<Character, Integer>();

		System.out.println("Enter String !!");
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();

		// saving values in HashMap
		for (i = 0; i < charArray.length; i++) {

			if (valueMap.isEmpty()) {

				valueMap.put(charArray[i], 1);
			}

			else {

				if (valueMap.containsKey(charArray[i])) {

					valueMap.put(charArray[i], valueMap.get(charArray[i]) + 1);

				}

				else {

					valueMap.put(charArray[i], 1);
				}

			}
		}

		System.out.println(valueMap);

		// removing even values and printing rest in map as well as string format
		for (Map.Entry<Character, Integer> entry : valueMap.entrySet()) {

			if (entry.getValue() % 2 == 0) {

				evenMap.put(entry.getKey(), entry.getValue());
			}

			else {

				oddMap.put(entry.getKey(), entry.getValue());
			}

		}

		System.out.println(evenMap);
		
		for (Map.Entry<Character, Integer> entry : oddMap.entrySet()) {
			
			for (i=0; i<entry.getValue(); i++) {
				
				System.out.print(entry.getKey());
			}
		}
	}

}
