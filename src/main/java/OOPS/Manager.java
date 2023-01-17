package OOPS;

public class Manager extends Employee {

    public Manager(){
        super(10);
    }

    public static void main(String[] args) {
        Manager manager =new Manager();
        //manager.isPresent = false;
        manager.setAttendance(true);
        System.out.println(manager.getAttendance());

    }
}
