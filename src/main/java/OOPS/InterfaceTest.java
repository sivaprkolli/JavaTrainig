package OOPS;

import java.beans.IntrospectionException;

public class InterfaceTest implements InterfaceMain, Interface2 {
    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void type() {
        System.out.println("Type");
    }

    @Override
    public void getText() {

    }

    @Override
    public void getAttribute() {

    }
}
