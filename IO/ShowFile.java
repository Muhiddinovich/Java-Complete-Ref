package reading_and_writing_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		// First confirm that a filename has been specified.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}

		// Attempt to open the file.

		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot Open File");
			return;
		}
		// at this point, file is open and can be read
		// Following reads characters until EOF is encountered

		try {
			do {
				i=fin.read();
				if (i!=-1) {
					System.out.print((char)i);
					
				}

			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Error reading files");
		}
		try {
			fin.close();
		}catch (IOException e) {
			System.out.println("Error closing file");
		}
	}
}
