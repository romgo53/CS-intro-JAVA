
public class Y extends Z {
    protected int _yVal;
    public Y(int zVal, int yVal) {
        _yVal = yVal;
    }
    public boolean foo(int n){
        return n == _zVal;
    }
}