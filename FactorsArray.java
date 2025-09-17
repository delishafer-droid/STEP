import java.util.Scanner;
public class FactorsArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER: ");
        int number = input.nextInt();
    
        int a[] = new int[number];
        int j=0;

        for (int i=1; i <= number; i++) {
            if (number % i == 0) {
                a[j] = i;
                j++;
            }
        }
        System.out.println("Factors Array:");
        for (int m = 0; m < j; m++) {
            System.out.print(a[m]+" ");
        }
    }
}
