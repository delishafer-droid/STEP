import java.util.Scanner;

public class StringCompare {
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstString = scanner.next();

        System.out.print("Enter second string: ");
        String secondString = scanner.next();

        boolean customComparison = compareStrings(firstString, secondString);

        boolean builtInComparison = firstString.equals(secondString);

        System.out.println("Result from custom compareStrings method: " + customComparison);
        System.out.println("Result from built-in equals() method: " + builtInComparison);

        if (customComparison == builtInComparison) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("Methods produced different results!");
        }
        scanner.close();
    }
}
