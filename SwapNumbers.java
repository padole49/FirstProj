package com.kunal.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapNumbers {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numers:");
		int a1= Integer.parseInt(br.readLine());
		int a2=Integer.parseInt(br.readLine());
		
		System.out.println("a1 =" +a1);
		System.out.println("a2 =" +a2);
		
		
		
	}
}
