package Misc;

public class TestB extends TestA{

    public void test2(){
        System.out.println("Testing B");
    }

    public static void main(String[] args) {
        //Upcasting
        TestA testa = (TestA) new TestB();

        TestA test = new TestB();

        //Down casting
        TestA testA =  new TestB();
        TestB testb =  (TestB)testA;


        TestB testB = (TestB) testA; // new TestB();


    }
}
