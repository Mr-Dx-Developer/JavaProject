import java.util.Scanner;
import java.util.Date;

public class CourseManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Are you a student or teacher? Press 1 for student, 2 for teacher");
            int userType = input.nextInt();
            if (userType == 1) {
                System.out.println("What do you want to do? Press 1 to add course enrollment, 2 to remove course enrollment, 3 to view enrolled course list");
                int choice = input.nextInt();
                switch(choice) {
                    case 1: 
                        addCourseEnrollment(input);
                        break;
                    case 2:
                        removeCourseEnrollment(input);
                        break;
                    case 3:
                        viewEnrolledCourseList(input);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } else if (userType == 2) {
                System.out.println("What do you want to do? Press 1 to view course enrollments, 2 to view student list for a course");
                int choice = input.nextInt();
                switch(choice) {
                    case 1:
                        viewCourseEnrollments(input);
                        break;
                    case 2:
                        viewStudentList(input);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } else {
                System.out.println("Invalid user type. Please try again.");
            }
            System.out.println("Press 1 to go back to the main menu, 2 to exit");
            int menuChoice = input.nextInt();
            if (menuChoice == 2) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }

    public static void addCourseEnrollment(Scanner input) {

        System.out.println("Enter student ID:");
        String studentID = input.next();
        System.out.println("Enter course code:");
        String courseCode = input.next();
        System.out.println("Enter section number:");
        int sectionNumber = input.nextInt();
        Date courseStartDate = new Date(); //Replace with actual start date
        Date courseEndDate = new Date(); //Replace with actual end date

        //Check if student is already enrolled in course
        //Check if course section is full
        //Check if course timings clash with other enrolled courses

        System.out.println("Course enrollment successful.");
    }

    public static void removeCourseEnrollment(Scanner input) {

        System.out.println("Enter student ID:");
        String studentID = input.next();
        System.out.println("Enter course code:");
        String courseCode = input.next();

        //Check if student is enrolled in the course

        System.out.println("Course enrollment removed successfully.");
    }

    public static void viewEnrolledCourseList(Scanner input) {

        System.out.println("Enter student ID:");
        String studentID = input.next();

        //Print list of enrolled courses for student
    }

    public static void viewCourseEnrollments(Scanner input) {

        System.out.println("Enter course code:");
        String courseCode = input.next();

        //Print list of enrolled students for course
    }

    public static void viewStudentList(Scanner input) {

        System.out.println("Enter course code:");
        String courseCode = input.next();
        System.out.println("Enter section number:");
        int sectionNumber = input.nextInt();

        //Print list of students enrolled in course section
    }
}
