public class Engine {
    private String designer;
    private int power;

    public Engine() {
        super();
    }
    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }
    public String getDesigner(){
        return designer.substring(0, 3).toLowerCase();
    }

    public void setPower(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }

}
