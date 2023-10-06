// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter designer: %n");
        String designerName = input.nextLine();

        System.out.printf("Enter power: %n");
        int power = input.nextInt();

        System.out.println("1. Test getDesigner()");
        System.out.println("2. Test setPower()");

        System.out.print("Enter TC(1 or 2):");
        int userChoice = input.nextInt();

        Engine engine = new Engine(designerName, power);

        if(userChoice == 1) {
            System.out.println(engine.getDesigner());
        }
        if(userChoice == 2) {
            System.out.printf("Enter new power: %n");
            power = input.nextInt();
            engine.setPower(power);
            System.out.println(engine.getPower());
        }    }
}