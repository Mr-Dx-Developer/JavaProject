import java.lang.runtime.SwitchBootstraps;
import java.util.*;

import javax.lang.model.element.Element;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();


       /*  if (button == 1){
            System.out.println("Hello");
        } else if (button == 2){
            System.out.println("Namazte");
        } else if ( button == 3){
            System.out.println("Bonjur");
        } else {
            System.out.println("Invalid Button");
        } */
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namazte");
            break;
            case 3: System.out.println("lk");
            break;
            default: System.out.println("Invalid");
        }        
    }
}
