package markKodenest;

import java.util.Scanner;

public class kodenestApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your mark");
		int mark= scan.nextInt();
		System.out.println("wellcome to kodenest");
		eligible(mark);
	}
	public static void eligible(int a) {
		if (a>=80) {
			System.out.println("wellcome to Tech Club");
		}
		else {
			System.out.println("you are not eligible");
		}
	}

}
