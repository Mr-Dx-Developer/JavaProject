import java.util.Scanner;

public class calculator {

/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 

1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b

Calculate the result according to the operation given and display it to the user.
 */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);


        double result;

        System.out.println("Enter a: ");
        double a = sc.nextDouble();

        System.out.println("operation (+,-,*,/)");
        double operation = sc.nextDouble();

        System.out.println("Enter b: ");
        double b = sc.nextDouble();


        if (operation == '+'){
            result = a + b;
        } else if(operation == '-'){
            result = a - b;
        } else if(operation == '*'){
            result = a * b;
        } else if(operation == '/'){
            result = a / b;
        } else {
            System.out.println("Invalid: ");
        }


        



    }
}
