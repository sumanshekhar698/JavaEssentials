package com.tcs_digitl.questions;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Scanner scanner = new Scanner(System.in);
//		String first=scanner.nextLine();
//		int second = scanner.nextInt();
		String first = "SumanShekhar";
		String substring = first.substring(2,5);
		String custom = subpart(first,2,5);
		System.out.println(custom);
		System.out.println(substring);
		
		
		
		
		
	}
	
	
	
	static String subpart(String x,int i, int j) {
		String result="";
		for (int k = i; k < j; k++) {
			result+=x.charAt(k);
		}
		
		
		return result;
	}

}
