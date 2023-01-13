package Constructors;

public class StaticVariable {
    static String name;
    static int empId;
    static String organization = "MotivityLabs";

    public StaticVariable(String name, int empId){
        this.name = name;
        this.empId = empId;
    }

    public static void main(String[] args) {
        StaticVariable staticVariable;
        staticVariable = new StaticVariable("Joe", 1);
        testAutomation();
        staticVariable = new StaticVariable("Ram", 2);
        testAutomation();

        System.out.println(organization);
    }

    public static void testAutomation(){
        System.out.println(name + " " + empId + " " + organization);
    }

    static {
        System.out.println("Selenium Automation");
    }

    public static class Child{
        static {
            System.out.println("Mobile Automation");
        }
    }
}
