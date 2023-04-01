public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Faculty extends Person {
    private double salary;
    private char initial;

    public Faculty(String name, int age, double salary, char initial) {
        super(name, age);
        this.salary = salary;
        this.initial = initial;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSalary: " + salary + "\nInitial: " + initial;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Initial: " + initial);
    }
}

public class Main {
    public static void main(String[] args) {
        Faculty faculty = new Faculty("John Smith", 45, 60000.0, 'J');

        System.out.println("Using toString() method:");
        System.out.println(faculty.toString());

        System.out.println("\nUsing printInfo() method:");
        faculty.printInfo();
    }
}
