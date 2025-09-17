import java.util.Scanner;
public class PrimeCheck{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int num,i=2;
		boolean isPrime=true;

		System.out.println("Enter the no. of choice : ");
		num=input.nextInt();

		if(num<=1){
			isPrime=false;

		}else{
			for(i=2;i<num;i++){
				if(num%i==0){
					isPrime=false;
				}
			}
		}
		if(isPrime){
			System.out.println("The Number is a Prim Number ");
		}else{
			System.out.println("The Number is not prime number.");
		}
	}
}