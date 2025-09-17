import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double weight,height,bmi;

	System.out.println("Enter weights in kg : ");
	weight=input.nextDouble();
	System.out.println("Enter height in cm : ");
	height=input.nextInt();
	height/=100;
	
	bmi=weight/(Math.pow(height,2));

	System.out.println("The BMI is  "+bmi);
	if (bmi<=18.4){
		System.out.println("Status : Underweight");
	}else if (bmi>18.4 && bmi<30.0){
		System.out.println("Status : Normal");
	}else if (bmi>24.9 && bmi<40.0){
		System.out.println("Status : Overweight");
	}else if (bmi>24.9 && bmi<40.0){
		System.out.println("Status : Overweight");
	}else{
		System.out.println("Status : Obese");
	}
}
}