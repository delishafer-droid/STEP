import java.util.Scanner;

public class PositiveNegative{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the number :");
	int n1=input.nextInt();
	CheckPositiveNegative(n1);
	}
	static void CheckPositiveNegative(int n1){
	if(n1>0){
		System.out.println("The No. is positive");
	}else if(n1<0){
		System.out.println("The No. is negative");
	}else{
		System.out.println("The No. is zero");
	}
}
}