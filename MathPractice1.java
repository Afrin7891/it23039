import java.util.Scanner;

public class MathPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Equation 1: Calculate the height of a right triangle.");
        System.out.print("Enter base (b): ");
        double base = scanner.nextDouble();
        System.out.print("Enter angle (theta in degrees): ");
        double thetaDegrees = scanner.nextDouble();
        double thetaRadians = Math.toRadians(thetaDegrees); 
        double height = base * Math.tan(thetaRadians); 
        System.out.println("Height: " + height + "\n");

        
        System.out.println("Equation 2: Compound Interest Calculation.");
        System.out.print("Enter Principal (P): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate (r as a decimal): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Number of Compounds per Year (n): ");
        int compounds = scanner.nextInt();
        System.out.print("Enter Time in Years (t): ");
        int time = scanner.nextInt();
        double totalAmount = principal * Math.pow(1 + (rate / compounds), compounds * time);
        System.out.println("Total Amount: " + totalAmount + "\n");

        
        System.out.println("Equation 3: Convert Cartesian to Polar Coordinates.");
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        double radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); 
        double angle = Math.toDegrees(Math.atan2(y, x)); 
        System.out.println("Radius: " + radius + ", Angle: " + angle + " degrees\n");

        
        System.out.println("Equation 4: Calculate Distance Between Two Points.");
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
        System.out.println("Distance: " + distance + "\n");

     
        System.out.println("Equation 5: Solve Quadratic Equation.");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + " and " + root2);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scanner.close();
    }
}
