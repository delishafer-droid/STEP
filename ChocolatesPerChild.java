import java.util.Scanner;
public class ChocolatesPerChild{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Number no. of chocolates :");
	int number=input.nextInt();
	System.out.println("Number of  students:");
	int students=input.nextInt();

	findChocolates(number,students);
}
	static void findChocolates(int number, int students ){
	int quotient= (int)number/students;
	int remainder= (int)number%students;

	System.out.println("chocolates remaining : "+remainder+" Chocolates per child : "+quotient);
	}
	}