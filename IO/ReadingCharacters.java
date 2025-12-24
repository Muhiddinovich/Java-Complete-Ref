package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingCharacters {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
		System.out.println("Enter chars, 'q' to quite");
		
		do {
			c=(char) bufferedReader.read();
			System.out.println(c);
		}while(c!='q');
		
	}
}
