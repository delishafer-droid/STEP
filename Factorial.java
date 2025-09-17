import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int n,fact=1,a=1;

	System.out.println("Enter the no. of choice");
	n=input.nextInt();

	while(a<=n){
		fact*=a;
		a+=1;
	}
	System.out.println("The Factorial of "+n+" is "+fact);

	}
}