// Name: Tanvir Anjum Neon
// ID: 2131079642



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1, name2, name3;
        String id1, id2, id3;
        String section1, section2, section3;
        double cgpa1, cgpa2, cgpa3;
        String gender1, gender2, gender3;

        System.out.println("Enter details for student 1:");
        System.out.print("Name: ");
        name1 = scanner.nextLine();
        System.out.print("ID: ");
        id1 = scanner.nextLine();
        System.out.print("Section: ");
        section1 = scanner.nextLine();
        System.out.print("CGPA: ");
        cgpa1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Gender: ");
        gender1 = scanner.nextLine();

        System.out.println("Enter details for student 2:");
        System.out.print("Name: ");
        name2 = scanner.nextLine();
        System.out.print("ID: ");
        id2 = scanner.nextLine();
        System.out.print("Section: ");
        section2 = scanner.nextLine();
        System.out.print("CGPA: ");
        cgpa2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Gender: ");
        gender2 = scanner.nextLine();

        System.out.println("Enter details for student 3:");
        System.out.print("Name: ");
        name3 = scanner.nextLine();
        System.out.print("ID: ");
        id3 = scanner.nextLine();
        System.out.print("Section: ");
        section3 = scanner.nextLine();
        System.out.print("CGPA: ");
        cgpa3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Gender: ");
        gender3 = scanner.nextLine();

        if (gender1.equalsIgnoreCase("female") && name1.length() == 4) {
            System.out.println("Student 1 - ID: " + id1 + ", Section: " + section1);
        }

        if (gender2.equalsIgnoreCase("female") && name2.length() == 4) {
            System.out.println("Student 2 - ID: " + id2 + ", Section: " + section2);
        }

        if (gender3.equalsIgnoreCase("female") && name3.length() == 4) {
            System.out.println("Student 3 - ID: " + id3 + ", Section: " + section3);
        }

        if (gender1.equalsIgnoreCase("male") && name1.startsWith("S")) {
            System.out.println("Student 1 - Name: " + name1 + ", CGPA: " + cgpa1);
        }

        if (gender2.equalsIgnoreCase("male") && name2.startsWith("S")) {
            System.out.println("Student 2 - Name: " + name2 + ", CGPA: " + cgpa2);
        }

        if (gender3.equalsIgnoreCase("male") && name3.startsWith("S")) {
            System.out.println("Student 3 - Name: " + name3 + ", CGPA: " + cgpa3);
        }
    }
}