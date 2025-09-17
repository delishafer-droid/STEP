import java.util.Scanner;
public class TemperaturConversion2{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		int celsiusResult,farenheit;
		
		farenheit= input.nextInt();
       	celsiusResult=(farenheit-32) * 5/9;

       	System.out.println(" The "+farenheit+" farenheit is "+celsiusResult+" celsius");
	}
}