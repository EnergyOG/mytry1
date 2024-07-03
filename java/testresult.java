package java;

public class testresult {
    public static void main(String[] args) {
        System.out.println("this just a trial");

        int a = 5;
        int b = 3;
        int c = 7;
        int d = 2;

        int result1 = sum(a, b);
        int result2 = subtract(c, d);

        System.out.println("The addition of a " + a + " and b " + b + " is your result " + result1);
        System.out.println("The subtraction of c " + c + " and d " + d + " is your result " + result2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int c, int d) {
        return c - d;
    }
}
