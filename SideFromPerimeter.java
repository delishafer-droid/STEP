import java.util.Scanner;
public class SideFromPerimeter{
	public static void main(String[] args){
	
	Scanner input= new Scanner(System.in);

	double perimeter,side;
	
	perimeter=input.nextInt();

	side=perimeter/4;

	System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}