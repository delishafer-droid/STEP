import java.util.Scanner;
public class FootballHeight{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);

	double height[]=new double[11];
	double k,m=0,mean=0;

	System.out.println("ENTER THE HEIGHT OF FOOTBALL PLAYER : ");
	for(int i=0;i<=10;i++){
		k=input.nextDouble();
		height[i]=k;
		m+=k;
	}
	mean=m/11;
	System.out.println("The mean is : "+mean);
	}
}
