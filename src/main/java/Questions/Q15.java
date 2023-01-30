package Questions;

public class Q15 {
    public static void main(String[] args) {
        try{
            int a[] = {0,1,2,4,5};
            int b = a[5];

        }catch (Exception e){
            System.out.println("Exception Caught");
        }
//        catch (ArrayIndexOutOfBoundsException re){
//            System.out.println("Runtime Exception Caught");
//        }
        finally {
            System.out.println("Automation Testing");
        }
    }
}
