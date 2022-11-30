import java.util.*;

public class Main {

    Scanner in = new Scanner(System.in);
    static Main main = new Main();

    private int num1, num2;
    private boolean isEqual;

    public static void main(String[] args) throws Exception {
        main.startProgram();
    }

    public void startProgram() {
        queryInteger();
        System.out.println("Result: " + isEqual);
    }

    public void queryInteger() {
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();

        setIsEqual(num1, num2);
    }

    public void setIsEqual(int num1, int num2) {
        if (num1 == num2) isEqual = true;
        else isEqual = false;
    }

    public boolean getIsEqual() {
        return isEqual;
    }
}