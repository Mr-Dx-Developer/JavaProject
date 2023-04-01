public class HW41 {
    public static void main(String[] args) {
        print(1, 'a');
        print('a', 1);
    }

    public static void print(int n, char c) {
        System.out.println("Integer: " + n + " Character: " + c);
    }

    public static void print(char c, int n) {
        System.out.println("Character: " + c + " Integer: " + n);
    }
}
