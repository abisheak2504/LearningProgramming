package temp;

import java.util.Scanner;

public class TemperatureConverte {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the farenhet value");
		double d1=scan.nextDouble();
		TemperatureConverter t1=new TemperatureConverter();
		double Celsius=t1.convertFahrenheitToCelsius(d1);
		System.out.println(Celsius);

	}

}
