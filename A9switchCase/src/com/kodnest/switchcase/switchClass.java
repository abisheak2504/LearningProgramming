package com.kodnest.switchcase;

import java.util.Scanner;

public class switchClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num  between 1 to 7");
		int num=scan.nextInt();
		weekClass w1=new weekClass();
		w1.week(num);
		scan.close();

	}

}
