package Questions;

public class Q7 {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        int x[] = new int[5];

        try {
            a = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Handling");
            a = a / 3;
            System.out.println("a value == " + a);
        }

        try {
            x[6] = 5;
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("IndexOutOfBoundsException Handling");
            x[4] = 7;
            System.out.println("x value == " + x[4]);
        }
    }
}
