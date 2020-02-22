package com.iwka;

import java.io.File;
import java.util.Scanner;

public class NNW {
	public static void Main (String[]args) {
		
	int x;
	int y;
	
		File pw = new File("C:\\Users\\iwkar\\Documents\\JavaProjectsSchool\\test.txt");
		 Scanner scan = new Scanner(System.in);

		 while (true) {
		     pw.read("\n" + scan.nextLine());
		     pw.flush();
		            }

		        

		
		findNNW(x,y);
	}
	
	public static void findNNW (int NNW) {
		
		int x;
		int y;
		
		if ( x != y) {
			NNW = x*y;
			System.out.println(" Wynik dla "+ x "i"+ y "jest" + NNW);
			return NNW;
		}
		
	}
	
	

}
