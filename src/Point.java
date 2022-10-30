public class Point {
    private int _x;
    private int _y;

    final int DEFAULT_VAL = 0;

    public Point(int x, int y) {
        _x = x;
        _y = y;
        if (x < DEFAULT_VAL)
            this._x = DEFAULT_VAL;
        if (y < DEFAULT_VAL)
            _y = DEFAULT_VAL;

    }

    public void move(int deltaX, int deltaY) {
        if (((_x + deltaX) >= DEFAULT_VAL) && ((_y + deltaY) >= DEFAULT_VAL)) {
            this._x += deltaX;
            this._y += deltaY;
        }
    }

    public void printStatus() {
        System.out.println("(" + _x + ", " + _y + ")");
    }


}

