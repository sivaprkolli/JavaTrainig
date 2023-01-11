package Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator unaryOperator = new UnaryOperator();

        int a = 10;
        int b = 20;

        ++a;
        System.out.println("Pre-Increment ::: " + a); // 11

        a++;
        System.out.println("Pre-Increment ::: " + a); //12
        System.out.println("Post-Increment ::: " + (a++));

        --b;
        System.out.println("Pre-Decrement ::: " + b);
        b--;
        System.out.println("Post-Decrement ::: " + b);
        System.out.println("Post-Decrement ::: " + (b--));
    }
}
