import java.util.Scanner;
public class VotingOf10{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int i,j,k;
	int[] a = new int[10];

	for(i=0;i<10;i++){
		System.out.println("ENTER THE AGE : ");
		a[i]=input.nextInt();
	}

	for(k=0;k<10;k++){
		if(a[k]>0){
			if(a[k]>18){
				System.out.println("The student with age "+a[k]+" can vote.");
			}else{
				System.out.println("The student with the age "+a[k]+" can't vote.");
			}
		}else{
			System.out.println("The entered age is negative.");

		}
	}
}
}