package WrapperClasses;

public class WrapperTest {
    public static void main(String[] args) {
        Integer i = new Integer(20);
        System.out.println(i);
        int a = Integer.valueOf(i);
        System.out.println(a);

        String s = "$500";
        s = s.replace("$", "");
        System.out.println(s);
        System.out.println(Integer.parseInt(s));
    }
}
