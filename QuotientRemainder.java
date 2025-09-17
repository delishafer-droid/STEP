import java.util.Scanner;
public class QuotientRemainder{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Number no. :");
	int number=input.nextInt();
	System.out.println("divisor no. :");
	int divisor=input.nextInt();

	System.out.println("The remainder and quotient is : ");
	findRemainderAndQuotient(number,divisor);
}
	static void findRemainderAndQuotient(int number, int divisor ){
	int quotient= (int)number/divisor;
	int remainder= (int)number%divisor;

	System.out.println("Remainder : "+remainder+" Quotient : "+quotient);
	}
	}