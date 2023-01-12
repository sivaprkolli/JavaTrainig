package Conditions;

public class ConditionsTest {

    public static void main(String[] args) {
        ConditionsTest conditionsTest = new ConditionsTest();

        int age = 11;

        if (age > 18) {
            System.out.println("apply for driving licence");
        } else if (age == 18) {
            System.out.println("eligible to apply for driving licence");
        } else {
            System.out.println("Not eligible to apply driving licence");
        }

        if(true){
            System.out.println("Book Ticket");
        } else{
            System.out.println("Don't Book Ticket");
        }


    }
}
