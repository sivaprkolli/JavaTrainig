package Constructors;

public class ConstructorParent extends Constructors{

    public ConstructorParent(int a, int b, int c){
        super(10.1f, 10);
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        ConstructorParent constructorParent = new ConstructorParent(5, 5, 5);
    }
}
