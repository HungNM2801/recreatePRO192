package DTO;
import handlingException.HandlingException;
import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {

    }
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void inputVase() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = HandlingException.toHandlingNumberException();
        System.out.println("Enter Material: ");
        material = input.next();
    }
    public void outputVase() {
        super.output();
        System.out.printf("Height: %d%n", height);
        System.out.printf("Material: %s%n", material);
    }
}
