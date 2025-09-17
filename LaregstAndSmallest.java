import java.util.Scanner;

public class LaregstAndSmallest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter the no. 1 :");
	int n1=input.nextInt();
	System.out.println("Enter the no. 2 :");
	int n2=input.nextInt();
	System.out.println("Enter the no. 3 :");
	int n3=input.nextInt();
	
	CalculateLaregstAndSmallest(n1,n2,n3);
	}
	static void CalculateLaregstAndSmallest(int n1,int n2,int n3){
	if(n1>n2 && n1>n3){
		System.out.println("The No. "+n1+" is the largest");
	}else if(n2>n1 && n2>n3){
		System.out.println("The No. "+n2+" is the largest");
	}else{
		System.out.println("The No. "+n3+ " is the largest");
	}

	if(n1<n2 && n1<n3){
		System.out.println("The No. "+n1+" is the smallest");
	}else if(n2<n1 && n2<n3){
		System.out.println("The No. "+n2+" is the smallest");
	}else{
		System.out.println("The No. "+n3+ " is the smallest");
	}
}
}








