import java.util.Scanner;

public class SumNaturalNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the number :");
	int n1=input.nextInt();
	NaturalNumbersSum(n1);
	}
	static void NaturalNumbersSum(int n1){
	int sum=0;
	for(int i=0;i<=n1;i++){
		sum+=i;
	}
	System.out.println("the sum is : "+sum);
}
}