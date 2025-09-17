import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your city of origin: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your final destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken for the first part of the journey (from " + fromCity + " to " + viaCity + ") in hours: ");
        double timeFirstPart = scanner.nextDouble();

        System.out.print("Enter the time taken for the second part of the journey (from " + viaCity + " to " + toCity + ") in hours: ");
        double timeSecondPart = scanner.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFirstPart + timeSecondPart;

        double averageSpeed = totalDistance / totalTime;

        System.out.printf("%s, your total distance traveled from %s to %s via %s is %.2f miles.%n", 
                          name, fromCity, toCity, viaCity, totalDistance);
        System.out.printf("The total time taken is %.2f hours and the average speed is %.2f miles per hour.%n", 
                          totalTime, averageSpeed);

    }
}