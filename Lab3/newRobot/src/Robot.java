public class Robot {
    protected String label;
    protected int type;

    public Robot() {
        super();
    }

    public Robot(String label, int type) {
        super();
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Robot{" + "label='" + label + '\'' + ", type=" + type + '}';
    }
}
