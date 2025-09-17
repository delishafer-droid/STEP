import java.util.Scanner;
public class SwapNumbers{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		int number1, number2, temp;

		number1=input.nextInt();
		number2=input.nextInt();
		temp=number1;
		number1=number2;
		number2=temp;

		System.out.println(" The swapped numbers are "+number1+" and "+number2);



	}
}