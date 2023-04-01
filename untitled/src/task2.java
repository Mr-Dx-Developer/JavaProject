// A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 44 - E
// c. 45 to 49 - D
// d. 50 to 59 - C
// e. 60 to 89 - B
// f. Above to 80 - A

// Ask user to enter marks and print the corresponding grade.

package task2;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number: ");
		int number = sc.nextInt();
		
		String grade;
		if (number >= 0 && number <= 25) {
			grade = "F";
		}else if (number >= 25 && number <= 60) {
			grade = "E";
		} else if (number >= 45 && number <= 49) {
			grade = "D";
		} else if (number >= 50 && number <= 59) {
			grade = "C";
		} else if (number >= 60 && number <= 80) {
			grade = "B";
		} else if (number >= 81 && number <= 100) {
			grade = "A";
		} else {
			grade = "Invalid";
		}
		
		System.out.println("Grade: " + grade);

	}

}
