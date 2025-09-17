import java.util.Scanner;
public class RocketLaunch{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int number1;	
	number1=input.nextInt();

	if(number1>0){
		System.out.println(" The "+number1+"is negative");
	}else if(number1<0){
		System.out.println(" The "+number1+"is positive");
	}else{
		System.out.println(" The "+number1+"is 0");
	}
	}
}