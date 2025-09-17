import java.util.Scanner;
public class Factorial2{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int n,i,fact=1,a=1;

	System.out.println("Enter the no. of choice");
	n=input.nextInt();

	for(i=1;i<=n;i++){
		fact*=i;
	}
	System.out.println("The Factorial of "+n+" is "+fact);

	}
}