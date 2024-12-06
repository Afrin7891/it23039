import java.util.Scanner;

public class Factorion {

    
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    
    public static boolean isFactorion(int num) {
        int sum = 0;
        int temp = num;
        
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += calculateFactorial(digit);
            temp /= 10;
        }

        
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the lower bound of the range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = sc.nextInt();

        System.out.println("Factorion numbers in the range:");

        
        for (int i = lower; i <= upper; i++) {
            if (isFactorion(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
