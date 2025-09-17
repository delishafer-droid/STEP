import java.util.Scanner;
public class Digits{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int num,digits=0;

	System.out.println("Enter any number : ");
	num=input.nextInt();

	while(num!=0){
		num/=10;
		digits++;
	}
	System.out.println("The no. of digits is "+digits);
	}
}