package javaL;

import java.util.Scanner;

public class CandidateCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int num = scanner.nextInt();
		
		String s = scanner.next();
		
		String output = mech(num , s);
		System.out.println(output);
		
	}

	private static String mech(int num, String s) {
		if(s.length() == 1) {
			return s;
		}
		else {
			String o1 = "";
			for (int i = 1; i < s.length(); i= i+2) {
				o1 = o1 + s.charAt(i);
			}
			s=o1;
			return mech(num/2, s);
		}
	}

}
