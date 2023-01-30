package Questions;

public class Q14B extends Q14A{
    public static void main(String[] args) {
        Q14A a =  new Q14A();
//        Q14B b = (Q14B) a;
        a.running();
    }

    public void running(){
        System.out.println("Running on the threadmill");
    }
}
