package Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        RelationalOperators relationalOperators = new RelationalOperators();

        int a = 10;
        int b = 20;
        int c = 10;

        int k = 30;
        int l = 20;

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= c);
        System.out.println(a <= c);
        System.out.println(a != b);

        System.out.println(a > b && a < b);
        System.out.println(a > b || a < b);

        k = l;
        System.out.println(k);

        k+= 5; // or k = k+ 5
        System.out.println(k);

        k-=15;
        System.out.println(k);

        System.out.println(k << 2); /// 10 * (2*2)
        System.out.println(k << 4); // 10 *(2*2*2*2)
        System.out.println(4 << 2);

        System.out.println(k >> 2);// 10 / (2*2)
        System.out.println(k >> 4); //
        System.out.println(16 >> 2);


    }
}
