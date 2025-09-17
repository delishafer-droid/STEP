import java.util.Scanner;
public class WindTemperatureSpeed{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Temperature of the wind :");
	double temperature=input.nextInt();
	System.out.println("Speed of the wind :");
	double windSpeed=input.nextInt();

	calculateWindChill(temperature,windSpeed);
}
	static void calculateWindChill(double temperature, double windSpeed ){
	double windChill=35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
	System.out.println("Wind Chill: "+windChill);
	}
	}