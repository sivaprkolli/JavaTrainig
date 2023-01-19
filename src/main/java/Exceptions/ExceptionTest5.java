package Exceptions;

public class ExceptionTest5 {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static boolean test2() {
        try {
            String s[] = {"a", "b", "c", "d"};
            char c[] = {'a', 'b', 'c', 'd'};
            System.out.println(s[4]);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :: " + e.toString());
            return false;
        }
    }

    public static boolean test1() {
        try {
            int i;
            i = 5 / 0;
            System.out.println(i);
            return true;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException " + e.toString());
            return false;
        }
    }
}
