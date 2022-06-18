package javaL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BUfferedReaderAndStringtokenizer {

	public static void main(String[] args) throws Exception {

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader("K:\\Interview\\projects.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			String line;
			int count= 0 ;
			
			while ((line = bufferedReader.readLine()) != null) {
				StringTokenizer  st = new StringTokenizer(line);
				
				while (st.hasMoreElements()) {

					System.out.println(st.nextToken());
					count++;
				}
				
			}
			
			System.out.println("numer of words in file are "+ count);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fileReader.close();
			bufferedReader.close();
		}
		
		
	}

}
