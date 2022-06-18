package javaL;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fileReader =null;
		FileWriter fileWriter = null;
		
		try {
			fileReader = new FileReader("K:\\Interview\\projects.txt");
			fileWriter = new FileWriter("K:\\Interview\\projects.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
