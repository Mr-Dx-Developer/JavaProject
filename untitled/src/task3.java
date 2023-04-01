// Write a program to check if a year is leap year or not.
// If a year is divisible by 4 then it is leap but if the year is century year like 2000, 1900, 2100
// then it must be divisible by 400.

package task3;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 !=0)  year % 400 ==0) {
			System.out.println( year + "Leap Year: ");
		} else {
			System.out.println( year + "is not leap");
		}
		

	}

}
