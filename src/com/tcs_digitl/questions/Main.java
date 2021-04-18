package com.tcs_digitl.questions;

import java.util.Scanner;

class Main
{
	static int count = 0;
    public static void balance(String inputString, int n, int ref)
    {
        if ((n & 1) == 1 && ref == 0) {
            return;
        }
        if (n == 0)
        {
            if (ref == 0) {
            	++count;
            }
            return;
        }
        if (ref > n) {
            return;
        }
        balance(inputString + "(", n - 1, ref + 1);
        if (ref > 0) {
            balance(inputString + ")", n - 1, ref - 1);
        }
    }
 
    public static void main(String[] args)
    {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n%2==1 || (n<=2 && n >= 50)) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
        String str = "";
 
        balance(str, n, 0);
        System.out.println(count);
    }
}