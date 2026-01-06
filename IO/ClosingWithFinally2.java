package reading_and_writing_files;

import java.io.FileInputStream;
import java.io.IOException;

public class ClosingWithFinally2 {
	public static void main(String[] args) {
		int i;
		FileInputStream fin=null;
		
		if (args.length!=1) {
			System.out.println("Enter proper argument");
			return;
		}
		try {
			fin=new FileInputStream(args[0]);
			do {
				i=fin.read();
				if(i!=-1) System.out.print((char)i);
			} while (i!=-1);
		} catch (IOException e) {
			System.out.println("IO error " +e);
		}
		finally {
			try {
				if(fin!=null)
					fin.close();
			} catch (IOException e2) {
				System.out.println("Error closing file");
			}
		}
	}
}
