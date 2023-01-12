package OOPS;

public class AbstractTest extends AbstractMain implements Interface2, Interface1{

    @Override
    void click() {
        System.out.println("Click");
    }

    @Override
    void type() {
        System.out.println("Type");
    }

    @Override
    public void getAttribute() {

    }

    @Override
    public void getText() {

    }
}
