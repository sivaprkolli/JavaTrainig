package Questions;

public class Q6 {
    public static void main(String[] args) {
        double a = 5;
        try {
            a = 5 / 2;
        } finally {
            a = 5 / a;
            System.out.println("a value === " + a);
        }
    }
}

