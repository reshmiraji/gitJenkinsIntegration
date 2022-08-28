package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.DocFlavor.CHAR_ARRAY;

public class CharacterCOunt {

	public static void main(String[] args) {
		String str = "sdsak  sjfkljdkfj sfdsfs";

		String str1 = "He said, 'The mailman loves you.' I heard it with my own ears.";

		int count = 0;
		int count2 = 0;
		try {
			// count ignoring space
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
					count = count + 1;
				}
			}
			System.out.println(count);
			// total count
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != ' ') {
					count2 = count2 + 1;
				} else {
					count2 = count2 + 1;
				}

			}
			System.out.println(count2);

			// count of '
			int temp = 0;
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == '\'') {
					temp++;

				}
			}
			System.out.println(temp);

			// find vovels count
			int tem1 = 0;
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e') {
					tem1++;
				}

			}
			System.out.println(tem1);
			// substring
			String st = "FUN";
			for (int i = 0; i < st.length(); i++) {
				for (int j = i; j < st.length(); j++) {

					System.out.println(st.substring(i, j + 1));
				}
			}
			System.out.println(
					"*****************************************************************************************");
			// revderse string

			for (int i = st.length() - 1; i >= 0; i--) {
				System.out.println(st.charAt(i));
			}

			System.out.println(
					"*****************************************************************************************");

			// half split string from from=nt and back

			String superb = "SUPER";
			for (int i = 0; i <= superb.length() / 2; i++) {
				System.out.println("From Front : " + superb.charAt(i));
				for (int j = superb.length() - 1; j > superb.length() / 2; j--) {
					System.out.println("From back : " + superb.charAt(j));
				}

			}
			System.out.println(
					"*****************************************************************************************");

			// Palindrome MALAYALAM
			String mal = "MALAYALAM";
			String reverse = "";
			for (int i = mal.length() - 1; i >= 0; i--) {
				reverse = reverse + mal.charAt(i);

			}
			System.out.println(reverse);
			System.out.println(mal.equals(reverse));

			System.out.println(
					"*****************************************************************************************");
// count the duplicate tcharacter of the string 
			String stm = "happya";
			int counter = 0;

			char[] charArray = stm.toCharArray();
			for (int i = 0; i < stm.length(); i++) {
				for (int j = i + 1; j < stm.length(); j++) {
					if (charArray[i] == charArray[j]) {
						// counter++;
						System.out.println(" Duplicate char :" + stm.charAt(j));
						break;
					}
				}
				/*
				 * if (counter > 0) { System.out.println(" Duplicate char :" + stm.charAt(i)); }
				 */
			}

			System.out.println(
					"*****************************************************************************************");

			// count character using map
			String stg = "countCharactersuing map";
			Map<Character, Integer> charHashMap = new HashMap<Character, Integer>();

			for (int i = 0; i < stg.length(); i++) {

				if (stg.charAt(i) != ' ') {
					if (charHashMap.containsKey(stg.charAt(i))) {
						charHashMap.put(stg.charAt(i), charHashMap.get(stg.charAt(i)) + 1);
					} else {
						charHashMap.put(stg.charAt(i), 1);
					}
				}
			}

			for (Entry<Character, Integer> chr : charHashMap.entrySet()) {
				System.out.println(chr.getKey() + " : " + chr.getValue());
			}
			System.out.println();

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

			// Prime number

			int num = 13, flag = 0, m = 0;

			if (num == 0 || num == 1) {
				System.out.println("Not Prime number");
			}
			m = num / 2;

			for (int i = 2; i < m; i++) {
				if (num % i == 0) {
					flag = 0;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("PRIME numbers");
			} else {
				System.out.println("Not Prime");

			}
			
			
			System.out.println(
					"*****************************************************************************************");
//COunt of numbers and revcerse number 
			
			int num1 = 85468, counter1 = 0 , reversedNum =0 , sum = 0;
		while (num1>0) {
		int	reminder = num1%10;
		reversedNum = reversedNum *10 +reminder ;
		counter1 =counter1 +1;
		num1=num1/10;
		sum = sum+reminder;
		}
		
		System.out.println("Count : "+counter1 + " Reversed snumber :"+reversedNum + "SUM : "+sum);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	private static Object carray(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
