package Questions;


public class Q8 {
    double j;
    public static void main(String[] args) {
        Q8 e = new Q8();
        try{
            System.out.println(e.j);
        }catch (Exception e1){
            throw new ArithmeticException("Test failed");
        }
    }
}
