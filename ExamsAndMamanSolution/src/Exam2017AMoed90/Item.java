package Exam2017AMoed90;

public class Item {
    private int _weight;
    private int _value;

    public Item(int w, int v){
        _weight = w;
        _value = v;
    }

    public int getValue() {
        return _value;
    }

    public int getWeight() {
        return _weight;
    }
}
