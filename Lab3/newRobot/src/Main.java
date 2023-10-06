import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter label: ");
        String labelName = input.nextLine();

        System.out.print("Enter type: ");
        int inputType = input.nextInt();

        System.out.print("Enter step: ");
        int inputStep = input.nextInt();

        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");

        System.out.println("Enter TC(1, 2, 3)");
        int userInput = input.nextInt();
        System.out.println("OUTPUT");

        switch (userInput) {
            case 1: {
                Robot all = new Robot(labelName, inputType);
                System.out.println(all);
                Robot all2 = new specRobot(labelName, inputType, inputStep);
                System.out.println(all2);
                break;
            }
            case 2: {
                specRobot b2 = new specRobot(labelName, inputType, inputStep);
                b2.setData();
                String v2 = b2.getLabel();
                int k2 = b2.getType();
                System.out.printf("%s, %d", v2, k2);
                break;
            }

            case 3: {
                specRobot b3 = new specRobot(labelName, inputType, inputStep);
                int v3 = b3.getValue();
                System.out.printf("%d\n", v3);
                break;
            }
            default:
                break;
        }
        System.out.println();
    }
}
