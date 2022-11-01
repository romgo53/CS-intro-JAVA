/**
 * Represents a car in a car fleet
 * @author Rom Amikam Waidergoren
 * @version 30.10.2022
 */

public class Car {
    private int _id;
    private char _type;
    private String _brand;
    private boolean _isManual;
    private static final int DEFAULT_ID = 9999999;
    private static final char DEFAULT_TYPE = 'A';
    private static final String AUTOMATIC_GEAR = "auto";
    private static final String MANUAL_GEAR = "manual";

    /**
     * Initialize the car object with the given parameters.
     * @param id:       The car's id.
     * @param type:     The car's type [A,B,C,D].
     * @param brand:    The car's brand.
     * @param isManual: The car's gear type [true=manual, false=auto].
     */
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

    /**
     * Copy constructor.
     * @param other:       The Car object that will be copied
     */
    public Car(Car other) {
        _id = other.getId();
        _type = other.getType();
        _brand = other.getBrand();
        _isManual = other.isManual();
    }

    /**
     * Validate that the given type is one of the 4 car types (A,B,C,D).
     * @param type: The car's type.
     * @return True if the type is valid, false otherwise.
     */
    private static boolean isValidType(char type) {
        return type == 'A' || type == 'B' || type == 'C' || type == 'D';
    }

    /**
     * Validate that the given id is a 7-digit number.
     * @param id: The car's id.
     * @return True if the id is valid, false otherwise.
     */
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

    public void setIsManual(boolean isManual) {
        _isManual = isManual;
    }

    /**
     * Generates a String that represents the Car's attributes.
     * @return A String that represents the Car.
     */
    public String toString() {
        return "id:" + _id + " type:" + _type + " brand:" + _brand + " gear:" + (_isManual ? MANUAL_GEAR : AUTOMATIC_GEAR);
    }

    /**
     * Checks if the given Car object is equal to this Car object.
     * @param other: The other Car object.
     * @return True if the given Car object is equal to this Car object, false otherwise.
     */
    public boolean equals(Car other) {
        return _type == other._type && _brand.equals(other._brand) && _isManual == other._isManual;
    }

    /**
     * Checks if this Car object is better that the given one.
     * Compares the types while A is the worst and D is the best.
     * If the types are equal, it checks if this car is auto and the other is manual.
     * @param other: The other Car object.
     * @return True if this Car is better than the other Car object, false otherwise.
     */
    public boolean better(Car other) {
        if (_type > other.getType())
            return true;
        return _type == other.getType() && _isManual && !other.isManual(); //If the types are equal, check if this car is auto and the other is manual.
    }

    /**
     *Checks if this car is worse than the other Car.
     * Same as the `better` method but this time it checks if the other car is better.
     * @param other: The other Car object.
     * @return True if this Car is better than the other Car object, false otherwise.
     */
    public boolean worse(Car other) {
        return other.better(this);
    }
}

