package Questions;

public class Q4 {
    public void displayScreen() {
        System.out.println("Watch Movie");
    }
    public static void main(String[] args) {
        Q4 q4 = null;
        try {
            q4.displayScreen();
        } catch (Exception npe) {
            System.out.println(npe.toString());
        }
    }
}
