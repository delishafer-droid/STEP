import java.util.Scanner;
public class LargestThreeNo{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int number1,number2,number3;	
	number1=input.nextInt();
	number2=input.nextInt();
	number3=input.nextInt();

	if((number1>number2)&&(number1>number3)){
		System.out.println(" The Laregst number is "+number1);
	}else if((number2>number1)&&(number2>number3)){
		System.out.println(" The Largest is "+number2);
	}else{
		System.out.println(" The Largest number is "+number3);
	}
	}
}
