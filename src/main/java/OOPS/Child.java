package OOPS;

public class Child extends Parent{

    public static void test3(){
        System.out.println("Testing Test3");
    }

    public static void main(String[] args) {
        Child child = new Child();
        //Parent parent = new Child();
        child.test1();
        test3();
        test2();
        Parent.test2();
        System.out.println("a value ===  " + child.a);
        System.out.println("b value ===  " + child.b);
        System.out.println("c value ===  " + c);
    }
}
