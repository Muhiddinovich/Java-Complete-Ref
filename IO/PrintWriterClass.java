package io;

import java.io.PrintWriter;

public class PrintWriterClass {
	public static void main(String[] args) {
		PrintWriter printWriter=new PrintWriter(System.out,true);
		printWriter.println("this is string");
		int i=-7;
		printWriter.println(i);
		double d=4.5e-7;
		printWriter.println(d);
	}
}
