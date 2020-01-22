package lesson3;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(sum(4, 5));
        int x = sum(1, 2);
        System.out.println(x);
        System.out.println(multiply(12, 4));
        int y = multiply(12, 4);
        System.out.println(y);
        System.out.println(share(3, 5));
        int r = share(3, 5);
        System.out.println(r);
        System.out.println(subtraction(3, 5));
        int g = subtraction(3, 5);
        System.out.println(g);

    }

    public static int sum(int a, int b) {
        return a + b;

    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int share(int a, int b) {
        return a / b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }
}


