// Name: Tanvir Anjum Neon
// ID: 2131079642

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int n1 = amount>=500?1:0;

        switch(n1){
            case 0:
                System.out.println("INVALID AMOUNT");
                break;
            case 1:
                int n2 = amount%500==0?1:0;
                switch(n2){
                    case 0:
                        System.out.println("INVALID VALUE");
                        break;
                    case 1:
                        int n3 = amount<=20000?1:0;
                        switch(n3){
                            case 0:
                                System.out.println("EXCEEDED AMOUNT");
                                break;
                            case 1:
                                System.out.println("TRANSACTION SUCCESSFUL");
                                break;
                        }
                        break;
                }
                break;
            default:
                System.out.println("Error Occurred");
        }
    }
}