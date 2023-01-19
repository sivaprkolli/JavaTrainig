package CustomExceptions;

import java.io.IOException;

public class E2 extends Exception{
    public static void main(String[] args) throws E1 {
      //  new E2().test1();
        try{
        waitForASec();
        }catch (IOException e){

        } catch (InterruptedException i){

        }

        try{
            int i=9/0;
        }catch (RuntimeException r){
            throw new E1("Arthematic Exception dont divide by zero", new Throwable("Test Fails"));
        }
    }

    public void test1(){
        System.out.println("Selenium");
    }
    public static void waitForASec() throws InterruptedException, IOException {
        Thread.sleep(1000);
    }

    public static void wait1Sec() {
        try{
        Thread.sleep(1000);}
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
