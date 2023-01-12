package Conditions;

public class SwitchTest {

    public static void main(String[] args) {
         int a = 2;
         String s = "k";

         switch (a){
             case 1:
                 System.out.println("1");
                 break;
             case 2:
                System.out.println("2");

             case 3:
                 System.out.println("3");
                    break;
             default:
                 System.out.println("Provide right value");
         }

         switch (s){
             case "s":
                 System.out.println("MotivityLabs");
             case "k":
                 System.out.println("KLabs");
             default:
                 System.out.println("DLabs");

         }
    }
}
