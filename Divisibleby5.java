import java.util.Scanner;
public class Divisibleby5{
	public static void main(String[] args){
	
	Scanner input= new Scanner(System.in);

	int number1;
	
	System.out.println("Enter the No.: ");
	number1=input.nextInt();

	if(number1%5==0){
		System.out.println("The "+number1+" is divisible by 5 .");
	}else{
		System.out.println("The "+number1+" is not Divisible by 5");
	}
	
	
	}
}