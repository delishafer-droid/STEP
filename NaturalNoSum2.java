import java.util.Scanner;
public class NaturalNoSum2{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in)

	int sum,natNo,a=0,sum1;
	System.out.println("Enter the no. : ");
	natNo=input.nextInt();
	for(i=0;i<=natNo;i++){
		sum+=i;
	}
	sum1=(natNo*(natNo+1)/2);

	if(sum==sum1){
		System.out.println("Verified that both of the ways give same ans :"+sum1);


	}else{
		System.out.println("the sum are not same ");
	} 
	}
}