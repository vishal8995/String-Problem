package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class stringProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		Map<Character, Integer> valueMap = new LinkedHashMap<Character, Integer>();

		System.out.println("Enter String !!");
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();

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

	}

}
