package test;

import java.util.HashMap;
import java.util.Map.Entry;

public class DeleteAfterExecuting {

	public static void main(String[] args) {
		String str = "MALAYALAM";
		int count = 0;
		String revereString = "";
		for (int i = str.length() -1; i >= 0; i--) {
			revereString = revereString + str.charAt(i);
			if (str.charAt(i) == 'A') {
				count++;

			}
		}
		if (revereString.equals(str)) {
			System.out.println("PALINDROME");
		}
		System.out.println(revereString);
		System.out.println("Count of A : " + count);
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length()-1; i++) {
			if (hashMap.containsKey(str.charAt(i))) {
				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i))+1);

			} else {
				hashMap.put(str.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> string : hashMap.entrySet()) {
			System.out.println(string.getKey()+":"+string.getValue());
		}
		
		int num = 23 ;
		int m = num / 2 , flag =0; 
		if (num==0||num==1) {
			System.out.println("Not prime");
		}else {
			for (int i = 2; i < m; i++) {
				if (num%i==0) {
					System.out.println("Not prime");
					flag=1;
					break;
					
				}
			}
			if (flag==0) {
				System.out.println("Prime");
			}
		}
		
	}
	
}
