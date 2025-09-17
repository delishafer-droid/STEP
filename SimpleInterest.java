import java.util.Scanner;

public class SimpleInterest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the principle");
	int P=input.nextInt();
	System.out.println("Enter the Rate");
	int R=input.nextInt();
	System.out.println("Enter the Time");
	int T=input.nextInt();
	System.out.println("The simple interest is : ");
	CalculateSimpleInterestRate(P,R,T);
	}
	static void CalculateSimpleInterestRate(int P,int R,int T){
	int simpleinterest=(int)(P*R*T)/100;
	System.out.println(simpleinterest);
}
}