package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingStrings {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		System.out.println("enter 'stop' to exit ");
		
		String str;
		do {
			str = bufferedReader.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));
		
	}
}
