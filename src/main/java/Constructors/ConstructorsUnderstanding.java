package Constructors;

public class ConstructorsUnderstanding {
    String name;
    int empId;
    String organization;

    public static void main(String[] args) {
        ConstructorsUnderstanding constructorsUnderstanding;
       // ConstructorsUnderstanding constructorsUnderstanding1;
        constructorsUnderstanding = new ConstructorsUnderstanding("Joe", 1, "MotivityLabs");
        constructorsUnderstanding.testAutomation();
        System.out.println("Testing");
        constructorsUnderstanding = new ConstructorsUnderstanding("Siva", 510, "MotivityLabs");
        System.out.println(constructorsUnderstanding.name);
        constructorsUnderstanding.testAutomation();
        //constructorsUnderstanding1.testAutomation();
    }

    public ConstructorsUnderstanding(String name, int empId, String organization){
        this.name = name;
        this.empId = empId;
        this.organization = organization;
    }

    public void testAutomation(){
        System.out.println(name + " " + empId + " " + organization );
    }

//    public int test(int empId){
//        this.empId = empId;
//        return empId;
//    }
}
