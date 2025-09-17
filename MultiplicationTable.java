import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int number,i=1;

	System.out.println("Enter the number:");
	number=input.nextInt();
	
	if(number>5 && number<10){
		for(i=1;i<=number;i++){
			System.out.println(number+"x"+i+"="+number*i);
		
		}
		
	}else{
		System.out.println("Invalid no. ");
	}
}
}