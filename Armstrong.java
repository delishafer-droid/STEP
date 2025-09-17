import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int num,temp,sum=0,rem,a=0,digits=0,tempdigits;

		System.out.println("Enter teh no. of choice : ");
		num = input.nextInt();
		temp=num;
		tempdigits=num;

		while(tempdigits!=0){
			tempdigits/=10;
			digits++;
		}


		while (temp!=0){
			a=(temp%10);
			sum+=Math.pow(a,digits);
			rem=temp/10;
			temp=rem;
		}

		if(sum==num){
			System.out.println(num+" is an Armstrong number.");
		}else{
			System.out.println(num+" is not an Armstrong number.");
		}

	}
}