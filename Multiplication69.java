import java.util.Scanner;
public class Multiplication69{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int i,j,k,m,n;
	int[] a = new int[11];

	System.out.println("ENTER THE NO. : ");
	k=input.nextInt();
	 if (k<10 && k>5) {
	 	for(j=0;j<=10;j++){
			a[j] = k*j;
		}

		for(n=1;n<=10;n++){
			System.out.println(k+"x"+n+"="+a[n]);
		}

	}else{
		System.out.println("Enter any no. between 6 and 9.");
	}
}
}