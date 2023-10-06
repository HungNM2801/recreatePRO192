package handlingException;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HandlingException {

    public static final Scanner input = new Scanner(System.in);
    public static int toHandlingNumberException() {

        boolean setLoop = true;
        int value = 0;

        while (setLoop) {
            try {
                value = input.nextInt();

                if (value == 0 || value < 0)
                    throw new IllegalArgumentException("User must enter input greater than 0");
                setLoop = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Please enter a valid number greater than 0\n");
                //e.printStackTrace();
                setLoop = true;
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a valid number greater than 0\n");
                //ex.printStackTrace();
                setLoop = true;
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter a valid number greater than 0\n");
                //e.printStackTrace();
                setLoop = true;
            }

        }
        return value;
    }

    public static boolean toHandlingBooleanException() {
        boolean value = true;
        boolean setLoop = true;
        while (setLoop) {
            try {
                value = input.nextBoolean();
                setLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("ERROR! Please enter true/false.");
                //e.printStackTrace();
                input.nextLine();
                setLoop = true;
            }
        }
        return value;
    }
}
