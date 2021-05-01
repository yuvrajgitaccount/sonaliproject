package com.demo;

import java.util.Scanner;

public class DemoProject {
	
	public static void main(String[] args) {
		
		//5
		int n ,temp,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("how much number you want to entry =");
		n=scanner.nextInt();
		for (int i = 1; i <=n ; i++) {
			System.out.println("entry the number in squence"+i+":");
			temp=scanner.nextInt();
			sum=sum+temp;
		}
		//end loop
		
		System.out.println("the sum of value is"+sum);
		
		
	}
	

}
