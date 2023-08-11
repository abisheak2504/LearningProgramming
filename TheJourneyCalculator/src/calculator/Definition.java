package calculator;

import java.util.Scanner;

public class Definition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the speed & time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator j1=new JourneyCalculator();
		System.out.println(j1.calculateDistance(speed, time));
		

	}

}
