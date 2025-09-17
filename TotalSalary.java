import java.util.Scanner;
public class TotalSalary{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		int salary,bonus,totalsalary;

		salary=input.nextInt();
		bonus=input.nextInt();
		totalsalary=salary+bonus;

		System.out.println(" The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+totalsalary);
	}
}