// Tanvir Anjum Neon
// ID: 2131079642



import java.util.Scanner;
public class HW31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int count = 0;
        int sum = 0;
        int product = 1;

        while (true) {
            System.out.print("Enter an integer (enter 0 to quit): ");
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            count++;
            sum += num;
            product *= num;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        }
    }
}
