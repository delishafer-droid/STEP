import java.util.Scanner;
public class NumberOfHandshakes{
	public static void main(String[] args){

	Scanner input= new Scanner(System.in);

	int numberOfStudents,numberOfhandshakes;

	numberOfStudents=input.nextInt();
	numberOfhandshakes=(numberOfStudents * (numberOfStudents - 1)) / 2 ;

	System.out.println("Number of possible handshakes: "+numberOfhandshakes);
	}
}