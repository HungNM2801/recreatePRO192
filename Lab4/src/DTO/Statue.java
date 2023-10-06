package DTO;
import handlingException.HandlingException;
import java.util.Scanner;

public class Statue extends Item{
    private int weight;
    private String color;
    public Statue() {

    }
    public Statue(int value, String creator, int weight, String color) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void inputStatue() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Weight: ");
        weight = HandlingException.toHandlingNumberException();
        System.out.println("Color: ");
        color = input.next();

    }
    public void outputStatue() {
        super.output();
        System.out.printf("Weight: %d%n", weight);
        System.out.printf("Color: %s%n", color);
    }
}
