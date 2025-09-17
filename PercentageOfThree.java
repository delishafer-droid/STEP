import java.util.Scanner;
public class PercentageOfThree{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double Physics,Chemistry,Maths,Percent;

		System.out.println("Enter the Physics marks : ");
		Physics=input.nextDouble();
		System.out.println("Enter the Chemistry marks : ");
		Chemistry=input.nextDouble();
		System.out.println("Enter the Maths marks : ");
		Maths=input.nextDouble();

		Percent=((Physics+Maths+Chemistry)/300)*100;

		System.out.println("The total percentage is : "+ Percent);

		if(Percent>=80){
			System.out.println("Grade : A, Remarks : Level 4, above agency-normalized standards");
		}else if(Percent < 80 && Percent >69){
			System.out.println("Grade : B, Remarks : Level 3, at agency-normalized standards");
		}else if(Percent<70 && Percent > 59 ){
			System.out.println("Grade : C, Remarks : Level 2, below, but approaching agency-normalized standards");
		}else if(Percent<60 && Percent > 49){
			System.out.println("Grade : D, Remarks : Level 1, well below agency-normalized standards");
		}else if(Percent <50 && Percent >39){
			System.out.println("Grade : E, Remarks : Level 1-, too below agency-normalized standards");
		}else{
			System.out.println("Grade : R ,Remarks : Remedial Standards ");
		}
	}
}