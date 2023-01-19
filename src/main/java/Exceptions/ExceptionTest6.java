package Exceptions;

public class ExceptionTest6 {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test2() {
        try {
            String s[] = {"a", "b", "c", "d"};
            char c[] = {'a', 'b', 'c', 'd'};
            System.out.println(s[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :: " + e.toString());
        }
    }

    public static void test1() {
        try {
            int i;
            i = 5 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.toString());
        }
    }
}
