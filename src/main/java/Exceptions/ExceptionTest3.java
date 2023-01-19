package Exceptions;

import java.rmi.server.ExportException;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try{
            int i = 9/1;

            if(test1()) {
                System.out.println("Executed successfully");
            }else{
                System.out.println("Executed fails");
            }
        } catch (Exception e){
            throw new ArithmeticException("dividing by zero is not accepted");
        }


    }

    public static boolean test1(){
        try{
            int a[]= {1,2,3,5,6};
            System.out.println(a[5]);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
