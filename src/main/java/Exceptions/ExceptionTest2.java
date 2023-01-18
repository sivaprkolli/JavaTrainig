package Exceptions;

import java.io.Serializable;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            String s[] = {"a", "b", "c", "d"};
            char c[] = {'a', 'b', 'c', 'd'};
            System.out.println(s[3]);
            int i;
            i = 5/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException :: " + e.toString());
        } catch (IndexOutOfBoundsException a){
            System.out.println("IndexOutOfBoundsException :: " + a.toString());
        } catch (RuntimeException r){
            System.out.println("RuntimeException :: " + r.toString());
            r.printStackTrace();
        } catch (Exception e){
            System.out.println("RuntimeException :: " + e.toString());
            e.printStackTrace();
        }
    }
}
