package Loops;

public class Loops {

    public static void main(String[] args) {
        Loops loops = new Loops();
        int k = 5;

        for(int i=0; i<12; i++){
            System.out.println(i);
        }

        while (k<6){
            System.out.println(k);
            k++;
        }

        do{
            System.out.println("Mobile Automation");
            k++;
        }while (k<7);
    }
}
