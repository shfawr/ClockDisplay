public class NumberDisplay {
    private int value;
    private int max;

    public NumberDisplay(int max) {
        this.max = max;
        this.value = 0;
    }

    public void setValue(int v) {
        if (v >= 0 && v < max) value = v;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value = (value + 1) % max;
    }

    public String getDisplayValue() {
        return (value < 10) ? "0" + value : "" + value;
    }
}
