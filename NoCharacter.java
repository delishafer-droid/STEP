import java.util.Scanner;
public class NoCharacter{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int i,j,k;
	int[] a = new int[5];

	for(i=0;i<5;i++){
		System.out.println("ENTER THE NO. : ");
		a[i]=input.nextInt();
	}

	for(k=0;k<5;k++){
		if(a[k]>0){
			System.out.println(a[k]+" is positive.");
			if(a[k]%2==0){
				System.out.println(a[k]+" is even.");
			}else{
				System.out.println(a[k]+" is odd.");
			}
		}else if(a[k]==0){
			System.out.println(a[k]+" is A zero.");
		}else{
			System.out.println(a[k]+" is negative.");
		}
	}

	if (a[0]>a[4]){
		System.out.println("First element is greater than last element.");
	}else if(a[0]<a[4]){
		System.out.println("First element is smaller than last element.");
	}else{
		System.out.println("First element and last element are equal");
	}
}
}