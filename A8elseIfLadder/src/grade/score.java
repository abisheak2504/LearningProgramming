package grade;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("wellcome to abisheak garde system");
		System.out.println("enter the mark");
		int score=scan.nextInt();
		gradeAllocation g1=new gradeAllocation();
		g1.grade(score);
		scan.close();

	}

}
