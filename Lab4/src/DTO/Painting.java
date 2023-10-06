package DTO;
import handlingException.HandlingException;
import java.util.Scanner;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean waterColor;
    private boolean isFramed;

    public Painting() {

    }
    public Painting(int value, String creator, int height, int width, boolean waterColor, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.waterColor = waterColor;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWaterColor() {
        return waterColor;
    }

    public void setWaterColor(boolean waterColor) {
        this.waterColor = waterColor;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean framed) {
        isFramed = framed;
    }
    public void inputPainting() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = HandlingException.toHandlingNumberException();
        System.out.println("Enter width: ");
        width = HandlingException.toHandlingNumberException();
        System.out.println("Is watercolor: ");
        waterColor = HandlingException.toHandlingBooleanException();
        System.out.println("Is framed:");
        isFramed = HandlingException.toHandlingBooleanException();
    }
    public void outputPainting() {
        super.output();
        System.out.printf("Height: %d%n", height);
        System.out.printf("Width: %d%n", width);
        System.out.printf("Is watercolor: %b%n", waterColor);
        System.out.printf("Is framed: %b%n", isFramed);
        System.out.println();
    }

}
