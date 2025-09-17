import java.util.Scanner;
public class QuotientAndRemainder{
	public static void main(String[] args){
	
	Scanner input= new Scanner(System.in);

	double number1, number2,quotient,remainder;
	
	number1=input.nextInt();
	number2=input.nextInt();

	quotient=number1/number2;
	remainder=number1%number2;

	System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+number1+" and "+number2);
	}
}