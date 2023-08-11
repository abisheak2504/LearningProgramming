package truble;

import java.util.Scanner;

public class doubletruble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));

	}
	public static int doubleTheNumber(int num) {
	return num*2;
	}
}
