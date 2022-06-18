package javaL;

import java.awt.event.FocusAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fStream = null;
		
		try {
			fStream = new FileInputStream(new File("C:\\Users\\Yousuf-Raiyan\\Downloads\\imageedit_2_9093516526.jpg"));
			System.out.println("File loaded");
			
			int i;
			while ((i = fStream.read()) != -1) {
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
