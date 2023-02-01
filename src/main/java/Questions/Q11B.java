package Questions;

public class Q11B extends  Q11A{
    public int test(){
        System.out.println((int) 10.0f);
        return (int) 10.0f;
    }
    public static void main(String[] args) {
        Q11A a = new Q11B();
        a.test();
    }
}
