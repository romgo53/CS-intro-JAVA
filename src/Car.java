public class Car {
    private int _id;
    private char _type;
    private String _brand;
    private boolean _isManual;
    private final int DEFAULT_ID = 9999999;
    private final char DEFAULT_TYPE = 'A';
    private final String AUTOMATIC_GEAR = "auto";
    private final String MANUAL_GEAR = "manual";

    public Car(int id, char type, String brand, boolean isManual) {
        _id = id;
        _type = type;
        _brand = brand;
        _isManual = isManual;
        if (!isValidType(type)) {
            _type = DEFAULT_TYPE;
        }
        if (!isValidId(id)) {
            _id = DEFAULT_ID;
        }
    }

    public Car(Car other) {
        _id = other._id;
        _type = other._type;
        _brand = other._brand;
        _isManual = other._isManual;
    }

    private static boolean isValidType(char type) {
        return type == 'A' || type == 'B' || type == 'C' || type == 'D';
    }

    private static boolean isValidId(int id) {
        return id >= 1000000 && id < 9999999;
    }

    public int getId() {
        return _id;
    }
    public char getType() {
        return _type;
    }
    public String getBrand() {
        return _brand;
    }
    public boolean isManual() {
        return _isManual;
    }
    public void setId(int id) {
        if (isValidId(id)) {
            _id = id;
        }
    }
    public void setType(char type) {
        if (isValidType(type)) {
            _type = type;
        }
    }
    public void setBrand(String brand) {
        _brand = brand;
    }
    public void setManual(boolean isManual) {
        _isManual = isManual;
    }
    public String toString() {
        return "id:" + _id + " type:" + _type + " brand:" + _brand + " gear:" + (_isManual ? MANUAL_GEAR : AUTOMATIC_GEAR);
    }
    public boolean equals(Car other) {
        return _type == other._type && _brand.equals(other._brand) && _isManual == other._isManual;
    }
    public boolean better(Car other) {
         if (_type > other._type)
             return true;
        return _isManual && !other._isManual;
    }
    public boolean worse(Car other) {
        return other.better(this);
    }
    public static void main(String[] args) {
        Car car = new Car(1234567, 'A', "Toyota", false);
        Car car2 = new Car(1232567, 'A', "Toyota", true);
        System.out.println(car2.worse(car));
    }
}

