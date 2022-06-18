package javaL;

import java.util.StringTokenizer;

public class StringTokinezerDemo {

	public static void main(String[] args) {

		String s  = "I am Mohd Yousuf Parvez , Ias officer ";
		StringTokenizer stringTokenizer = new StringTokenizer(s, " " , true);
		
		while (stringTokenizer.hasMoreElements()) {
			String object = (String) stringTokenizer.nextElement();
			System.out.println(stringTokenizer.nextToken());
			System.out.println(object);
			
		}
	}

}
