import java.util.Scanner;

public class SubstringComparison {
    
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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
        
        System.out.print("Enter the string: ");
        String inputString = scanner.next();
        
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();
        
        if (startIndex < 0 || endIndex > inputString.length() || startIndex >= endIndex) {
            System.out.println("Invalid indices.");
            return;
        }
        String substringUsingCharAt = substringUsingCharAt(inputString, startIndex, endIndex);
        
        String substringUsingSubstring = inputString.substring(startIndex, endIndex);
        
        boolean areEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingSubstring);
        
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingSubstring);
        System.out.println("Are the substrings equal? " + areEqual);
        
        scanner.close();
    }
}
