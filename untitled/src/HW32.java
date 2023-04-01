// Tanvir Anjum Neon
// ID: 2131079642


import java.util.Scanner;
public class HW32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        int hcf = (num1 * num2) / gcd;

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }

    }
}
