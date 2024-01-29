import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.println("Enter coefficient a:");
        double a = scanner.nextDouble();

        System.out.println("Enter coefficient b:");
        double b = scanner.nextDouble();

        System.out.println("Enter coefficient c:");
        double c = scanner.nextDouble();

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        // Check discriminant for real solutions
        if (discriminant >= 0) {
            // Calculate solutions using quadratic formula
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Display solutions
            System.out.println("Real Solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            System.out.println("No real solutions. Discriminant is negative.");
        }
    }
}
