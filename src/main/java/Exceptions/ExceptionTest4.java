package Exceptions;

public class ExceptionTest4 {
    public static void main(String[] args) {
        try{
            int i =5/0;
        }catch (Exception e){
            try{
                int i= 5/1;
            }catch (Exception e1){

            }
        }

    }


}
