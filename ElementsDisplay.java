import java.util.Scanner;
public class ElementsDisplay{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	double i,sum=0;
	int n,j=0;
	double[] a = new double[10];
	
	while(true){

		System.out.println("ENTER THE NO. : ");
		i=input.nextDouble();
		if (i<0){ 
			System.out.print("Numbers entered: ");
        	for (n = 0; n < j; n++) {
            	System.out.print(a[n] + " ");
            }
            System.out.println("The sum of all no. : "+sum);
			break;
        }
		if (j<10){
			a[j]=i;
			j++;
			sum+=i;
		} 
		else{
			System.out.println("The stack is full .");
				break;
		}
}
}
}