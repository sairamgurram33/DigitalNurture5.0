public class Calculator {
    private int value = 0;

    public void add(int number) {
        value += number;
    }

    public boolean subtract(int number) {
        if (value >= number) {
            value -= number;
            return true;
        }
        return false;
    }

    public int getValue() {
        return value;
    }
}

