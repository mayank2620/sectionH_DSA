//Question 2
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the cost for mess food (X) and restaurant splurges (Y)
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculate the weekly cost of food
        int weeklyCost = 6 * X + Y;

        // Output the result
        System.out.println(weeklyCost);

        scanner.close();
    }
}