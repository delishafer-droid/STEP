import java.util.Scanner;
public class SumTillZero2{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int number1,sum=0,a=1,i=1;

	for(i=1;i!=0;i++){
		System.out.println("Enter any no. : ");
		number1=input.nextInt();
		if (number1!=0){
			sum+=number1;
		}else{
			System.out.println("the user has entered 0.");
			i=0;
			break;
		}
		a=number1;

	}
	System.out.println("the sum till now: "+sum);
}
}
