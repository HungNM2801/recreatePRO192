package DTO;
import java.util.Scanner;
import handlingException.HandlingException;
public class Item {
    protected int value;
    protected String creator;

    public Item() {

    }
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void input() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        value = HandlingException.toHandlingNumberException();
        System.out.println("Enter creator: ");
        creator = input.nextLine();
}
    public void output() {
        System.out.printf("%nCreator: %s%n", creator);
        System.out.printf("Value: %d%n", value);
    }
}
