package junes;

import java.util.Scanner;

public class ±¸±¸´Ü {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input dan ");
		int dan = input.nextInt();
		
		int i;
		int sum=0;
		
		for(i=1;i<10;i++) {
			sum = dan*i;
			System.out.println(sum);
		}
		
		
		
	}
}
