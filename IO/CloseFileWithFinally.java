package reading_and_writing_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CloseFileWithFinally {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		if (args.length!=1) {
			System.out.println("More args than 1");
			return;
		}
		try {
			fin= new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		
		try {
			do {
				i=fin.read();
				System.out.print((char)i);
			} while (i!=-1);
		} catch (IOException e) {
			System.out.println("Error reading file");
		}
		finally {
			try {
				fin.close();
			} catch (IOException e2) {
				System.out.println("Error closing file");
			}
		}
	}
}
