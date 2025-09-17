import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int i=1;

	System.out.println("Enter the number:");
	int number=input.nextInt();
	
	if(number>0)
	{
		for(i=1;i<=number;i++)
		{
			if(i%3==0)
			{
				if(i%5==0){
					System.out.println("FizzBuzz"+" "+i);
				}
				else{
					System.out.println("Fizz"+" "+i);
				}
			}
			else if(i%5==0)
			{
				System.out.println("Buzz"+" "+i);
			}
		}
	}
	else{

		System.out.println("Enter valid no. ");

	    }

	}
}
