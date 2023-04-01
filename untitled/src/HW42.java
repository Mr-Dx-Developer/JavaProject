public class HW42 {
    public void printStudentInfo(String[] names, int[] ids, double[] cgpa) {
        double sum = 0.0;
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + ", ID: " + ids[i] + ", CGPA: " + cgpa[i]);
            sum += cgpa[i];
        }
        double avg = sum / names.length;
        System.out.println("CGPA Sum: " + sum + ", CGPA Average: " + avg);
    }

    public void printTopScorer(String[] names, int[] marks) {
        int maxIndex = 0;
        for (int i = 1; i < names.length; i++) {
            if (marks[i] > marks[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Top Scorer: Name: " + names[maxIndex] + ", Marks: " + marks[maxIndex]);
    }

    public static void main(String[] args) {
        HW42 HW42 = new HW42();

        // Example usage of printStudentInfo method
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ids = {1, 2, 3};
        double[] cgpa = {3.5, 4.0, 3.2};
        HW42.printStudentInfo(names, ids, cgpa);

        // Example usage of printTopScorer method
        int[] marks = {80, 90, 70};
        HW42.printTopScorer(names, marks);
    }
}
