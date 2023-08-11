package StringJoiner;

import java.util.Scanner;


public class Stringjoiner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 2 strings");
		String str1=scan.next();
		String str2=scan.next();
		Stringjoiner s1=new Stringjoiner();
		System.out.println(s1.joinStrings(str1, str2));

	}
	public String joinStrings(String str1, String str2) {
	return str1+str2;
	}

}
