public class specRobot extends Robot{
    protected int step;

    public specRobot() {
        super();
    }

    public specRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return "specRobot{" + "step=" + step + '}';
    }

    public void setData() {
      super.setLabel(label.substring(0,1) + this.step + label.substring(1));
    }
    public int getValue() {
        return type < 3 && label.contains("A") ? this.step : this.step + 2;
    }
}
