package Loops;

public class LoopsWithConditions {
    static int a = 2;

    public static void main(String[] args) {

        for(int i=0; i<5; i++){
           System.out.println(i);
            if(a==2){
                break;

            } else {
                continue;
            }
        }
    }
}
