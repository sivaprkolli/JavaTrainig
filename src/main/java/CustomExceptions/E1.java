package CustomExceptions;

public class E1 extends Exception{
    public E1(String errorMessage){
        super(errorMessage);
    }

    public E1(String errorMessage, Throwable message){
        super(errorMessage, message);
    }
}
