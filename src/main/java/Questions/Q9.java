package Questions;

public class Q9 {
    int c, d;

    public Q9(int cc, int dd) {
        cc = c;
        dd= d;
    }

    public int sum() {
        System.out.println(c + d);
        return c + d;
    }

    public static void main(String[] args) {
        Q9 q9 = new Q9(10, 10);
        q9.sum();
    }
}
