public class App {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        System.out.println(sum(a, b));
        System.out.println(div(a, b));
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}
