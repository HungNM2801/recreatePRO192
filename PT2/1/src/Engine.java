/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HÙNG
 */
public class Engine {
    private String designer;
    private int power;
    
    public Engine() {
        
    }

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    public String getDesigner() {
        String theThreeCharacter = designer.substring(0, 3);
        return theThreeCharacter.substring(0, 1). toLowerCase() + theThreeCharacter.substring(1);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
