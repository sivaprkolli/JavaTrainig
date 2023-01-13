package Constructors;

public class Constructors {

    public Constructors(){
        System.out.println("Testing Constructor");
    }

    public Constructors(int a, int b){
        System.out.println(a+b);
    }

    public Constructors(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public Constructors(float b, int a){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        //Constructors.Constructors constructors = new Constructors.Constructors();
        Constructors constructorsTest;
       // constructorsTest = new Constructors();

        Constructors constructorsParmeterized;
        constructorsParmeterized = new Constructors(5,5);


    }
}
