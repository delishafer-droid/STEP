import java.util.Scanner;
public class TemperaturConversion{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		int celsius,farenheitResult;
		
		celsius = input.nextInt();
       	farenheitResult=(celsius * 9/5) + 32;

       	System.out.println(" The "+celsius+" celsius is "+farenheitResult+" fahrenheit");
	}
}