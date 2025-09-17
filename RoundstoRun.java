import java.util.Scanner;
public class RoundstoRun{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		int side1, side2, side3, perimeter, remaining;

		side1=input.nextInt();
		side2=input.nextInt();
		side3=input.nextInt();
		
		perimeter=side1+side2+side3;

		remaining=5000/perimeter;

		System.out.println(" The total number of rounds the athlete will run is "+remaining+" to complete 5 km");



	}
}