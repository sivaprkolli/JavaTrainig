package OOPS;

public class MethodOverLoading {

    public static void main(String[] args) {

        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.sum(10, 10, 10);
        methodOverLoading.sum(10, 12.4f);


    }

    public void sum(int a, int b){
        int c ;
        c = a+b;
        System.out.println(" a + b == " + c);
    }

    public void sum(int a, float b){
        float c ;
        c = a+b;
        System.out.println(" a + b == " + c);
    }

    public void sum(int a, double b){
        double c ;
        c = a+b;
        System.out.println(" a + b == " + c);
    }

    public void sum(int a, int b, int d){
        int c ;
        c = a+b;
        System.out.println(" a + b == " + c);
    }

}
