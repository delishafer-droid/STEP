import java.util.Scanner;
public class PoundToKilogram{
	public static void main(String[] args){
	
	Scanner input= new Scanner(System.in);

	double Pound,Kilogram;

	Pound=input.nextDouble();
	Kilogram=Pound*2.2;

	System.out.println("The weight of the person in pound is "+Pound+" and in kg is "+Kilogram);

	}

}