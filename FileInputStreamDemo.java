package javaL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream  fStream = null ;
		try {
			fStream = new FileInputStream(new File("K:\\Interview\\projects.txt"));
			System.out.println("File opened");
			int i;
			while((i = fStream.read()) != -1) {
				System.out.print((char)i);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("file clossed");
		}
	}

}
