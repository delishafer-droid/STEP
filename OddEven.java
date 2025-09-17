import java.util.Scanner;
public class OddEven{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int n,i=1;

	System.out.println("Enter any no.");
	n=input.nextInt();
	if(n>0){
		System.out.println(n+" is a natural no.");
		for(i=1;i<=n;i++){
			if(i%2==0){
				System.out.println(i+" is a even no.");
			}else{
				System.out.println(i+" is a odd no.");
				}
		}
	}else{
		System.out.println(n+" is not a natural no.");

	}
}
}