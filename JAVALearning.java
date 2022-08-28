package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class JAVALearning {

	public static void main(String[] args) {
		String str = "NIVIN";
		String reverse = "", replaced = "";

		String my = "I am Reshmi. I am a software Engineer.";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);// reverse
			replaced = str.replace("V", "K");// replace
		}
		// duplicate character
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.println("Duplicate :" + str.charAt(i));
				}
			}
		}
		System.out.println("replaced :" + replaced);
		System.out.println(reverse);
		if (reverse.equals(str)) {
			System.out.println("PALINDROME");
		}
		// count of character

		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
			} else {
				hashMap.put(str.charAt(i), 1);
			}

		}
		for (Entry<Character, Integer> c : hashMap.entrySet()) {
			System.out.println(c.getKey() + " : " + c.getValue());
		}
		// find character a
		int count = 0;
		// ArrayList< Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'N') {
				count++;
				// list.add((int) str.charAt(i));
			}
		}
		System.out.println("countnn  :" + count);

		// reverse no
		int num = 13, reversed = 0;
		int counteer = 0, Sum = 0;
		while (num > 0) {
			int reminder = num % 10;
			reversed = reversed * 10 + reminder;
			num = num / 10;
			counteer = counteer++;
			Sum = Sum + reminder;
		}
		System.out.println("reversed :" + reversed + " : " + Sum + " : " + counteer);

		// Prime no

		int num1 = 23, m = 0, flag = 0, remind;
		m = num1 / 2;

		if (num1 == 0 || num1 == 1) {
			System.out.println("Not Prime");
			flag = 0;
		} else {
			for (int i = 2; i <= m; i++) {
				System.out.println(num1%i);
				if (num1%i==0) {
					System.out.println("NotPrime");
					flag = 1;
					break;
				}
			}
		}

		if (flag == 0) {
			System.out.println("Prime No");
		}

		// Swap 2 digits in a number
		int number = 456;
		String temp = Integer.toString(number);
		int[] numberArray = new int[temp.length()];

		for (int i = 0; i < temp.length(); i++) {
			numberArray[i] = temp.charAt(i) - '0';
		}

		for (int j : numberArray) {
			// System.out.println(j);
			if (j == 5) {
				j = 2;
			}
			System.out.println(j);
		}

		String[] stringArray = my.split(" ");
		int counter = 0;
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals("I")) {
				counter++;

			}
		}
		System.out.println(counter);
		
		System.out.println(
				"*****************************************************************************************");
		// count character using strings
		String longString = "I am Reshmi, I like playing play, and I do sepnd time for playing";
		System.out.println(longString);

		Map<String, Integer> stringHashMap = new HashMap<String, Integer>();
		String[] string = longString.split(" ");

		for (int i = 0; i < string.length; i++) {

			if (longString.charAt(i) != ',') {

				if (stringHashMap.containsKey(string[i])) {
					stringHashMap.put(string[i], stringHashMap.get(string[i]) + 1);
				} else {
					stringHashMap.put(string[i], 1);
				}
			}
		}
		for (Entry<String, Integer> stringMap : stringHashMap.entrySet()) {
			System.out.println(stringMap.getKey() + " : " + stringMap.getValue());
		}
		System.out.println(
				"*****************************************************************************************");

	}
}
