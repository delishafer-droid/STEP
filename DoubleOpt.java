import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
	
	Scanner input= new Scanner(System.in);

	double a,b,c,number1,number2,number3,number4;
	
	a=input.nextInt();
	b=input.nextInt();
	c=input.nextInt();

	number1= a + b *c;
	number2= a * b + c;
	number3= c + a / b ;
	number4= a % b + c;

	System.out.println(" The results of Double Operations are "+number1+","+number2+","+number3+", and "+number4);
	}
}