package java;

public class testresult {
    public static void main(String[] args) {
        System.out.println("this just a trial");

        int a = 5;
        int b = 3;
        int c = 7;
        int d = 2;
        int e = 10;
        int f = 4;

        int result1 = sum(a, b);
        int result2 = subtract(c, d);
        int result3 = division(e,f);

        System.out.println("The addition of a " + a + " and b " + b + " is your result " + result1);
        System.out.println("The subtraction of c " + c + " and d " + d + " is your result " + result2);
        System.out.println("The division of e " + e + " and f " + f + " is your result " + result3);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int c, int d) {
        return c - d;
    }
    public static int division(int e, int f){
        return e/f;
    }
}
