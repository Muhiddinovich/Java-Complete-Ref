package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingString2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
		String[] strings=new String[100];
		System.out.println("Enter lines of text");
		System.out.println("Enter 'stop' to exit");
		for(int i=0;i<100;i++) {
			strings[i]=bufferedReader.readLine();
			if(strings[i].equals("stop")) break;
		}
		
		System.out.println("here is your file");
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equals("stop")) break;
			System.out.println(strings[i]);
			
		}
		
		
	}
}
