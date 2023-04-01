
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // for (int counter = 0; counter < 10; counter = counter + 1){
        //    System.out.println("Hello world!");
      //  }


//        for(int i = 0; i<11; i++){
//            System.out.println(i);
//        }



//        int i = 0;
//        while (i <11){
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<10);


        Scanner sc = new Scanner(System.in);
//        int sum = 0;
        int n = sc.nextInt();
//
//        for(int i=1; i<=n; i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);

        for(int i=1; i<=n; i++){
            System.out.println(n*i + "\t");
        }






    }
}