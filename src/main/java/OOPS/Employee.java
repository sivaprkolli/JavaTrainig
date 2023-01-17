package OOPS;

public class Employee {
    int idNumber;
    String name;
    private boolean isPresent;

    public Employee(int idNumber){
        this.idNumber = idNumber;
        System.out.println("idNumber :: " + idNumber);
    }

    public void setAttendance(boolean isPresent){
        this.isPresent = isPresent;
        System.out.println("Employee :: " + isPresent);
    }
    public boolean getAttendance(){
        System.out.println("You attendance is");
        return isPresent;
    }

}
