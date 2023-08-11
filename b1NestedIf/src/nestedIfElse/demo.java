package nestedIfElse;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		if (a>0) {
			System.out.println(a+"it is a positive number");
			if (b>0) {
				System.out.println(b+"it is a positive number");
			}
			else {
				System.out.println(b+"it is a negative number");
			}
		}
		else {
			System.out.println(a+"it is negative number");
		}

	}

}
