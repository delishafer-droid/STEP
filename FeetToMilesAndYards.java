import java.util.Scanner;
public class FeetToMilesAndYards{
	public static void main(String[] args){
	
	Scanner input= new Scanner(System.in);

	double distanceInFeet,miles,yards;
	
	distanceInFeet=input.nextInt();

	yards=distanceInFeet/3;
	miles=yards/1760;

	System.out.println("The distance in miles is "+miles+" and distance in yards is "+yards);
	}
}