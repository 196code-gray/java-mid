package src.lang.string.chaining;

public class ValueAdder {
    private int value;

    public ValueAdder add(int add){
        value += add;
        return this;
    }

    public int getValue() {
        return value;
    }
}
