import java.util.Scanner;
public class EvenOddArray{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	int EvenIndex=0,OddIndex=0;


	System.out.println("ENTER THE NUMBER : ");
	int number= input.nextInt();
	int size=(number/2)+1;
	System.out.println("size "+size);

	int even[]=new int[size];
	int odd[]=new int[size];

	for(int i=1;i<=number;i++){
		if(i%2==0){
			even[EvenIndex]=i;
			EvenIndex++;
		}else{
			odd[OddIndex]=i;
			OddIndex++;
		}
	}

	for(int m=0;m<=EvenIndex;m++){
		System.out.println("Even Array: ");
		System.out.println(even[EvenIndex]);
	}

	for(int n=0;n<=OddIndex;n++){
		System.out.println("Odd Array: ");
		System.out.println(even[OddIndex]);
	}
	}
}
