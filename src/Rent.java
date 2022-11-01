/**
 * This class represents a Rent object.
 *
 * @author Rom Amikam Waidergoren
 * @version 31.10.2022
 */

public class Rent {
    private String _name;
    private Car _car;
    private Date _pickDate;
    private Date _returnDate;

    private static final int WEEKLY_DISCOUNT = 10;// 10% discount for weekly rent (7 days)
    private static final int DAYS_IN_A_WEEK = 7;
    private static final int TYPE_A_PRICE = 100;
    private static final int TYPE_B_PRICE = 150;
    private static final int TYPE_C_PRICE = 180;
    private static final int TYPE_D_PRICE = 240;

    /**
     * Initialize a new Rent object.
     * the returnDate must be at least one day after the pickDate, otherwise set it to one day after the pickup date
     *
     * @param name:       The renter's name.
     * @param car:        The car object.
     * @param pickDate:   The pick date.
     * @param returnDate: The return date.
     */
    public Rent(String name, Car car, Date pickDate, Date returnDate) {
        _name = name;
        _car = car;
        _pickDate = pickDate;
        _returnDate = returnDate;
        if (_pickDate.after(_returnDate))
            _returnDate = _pickDate.tomorrow();
    }

    /**
     * Copy constructor.
     *
     * @param other: The Rent object that will be copied.
     */
    public Rent(Rent other) {
        _name = other._name;
        _car = other._car;
        _pickDate = other._pickDate;
        _returnDate = other._returnDate;
    }

    public String getName() {
        return _name;
    }

    public Car getCar() {
        return _car;
    }

    public Date getPickDate() {
        return _pickDate;
    }

    public Date getReturnDate() {
        return _returnDate;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setCar(Car car) {
        _car = car;
    }

    public void setPickDate(Date pickDate) {
        if (pickDate.before(_returnDate)) {
            _pickDate = pickDate;
        }
    }

    public void setReturnDate(Date returnDate) {
        if (returnDate.after(_pickDate)) {
            _returnDate = returnDate;
        }
    }

    /**
     * Checks if the given Rent object (other) is equal to this Rent object.
     *
     * @param other: The other Rent object.
     * @return True is they are equal, false otherwise.
     */
    public boolean equals(Rent other) {
        return _name.equals(other._name) && _car.equals(other._car) && _pickDate.equals(other._pickDate) && _returnDate.equals(other._returnDate);
    }

    /**
     * Returns number of rent days.
     *
     * @return The number of days between the pick date and the return date.
     */
    public int howManyDays() {
        return _pickDate.difference(_returnDate);
    }

    /**
     * Each car type has a different price per day.
     * This method gets the car type and returns the price per day.
     *
     * @param type: The car type [A,B,C,D].
     * @return The price per day of the given type.
     */
    private static int getPriceOfType(char type) {
        return switch (type) {
            case 'A' -> TYPE_A_PRICE;
            case 'B' -> TYPE_B_PRICE;
            case 'C' -> TYPE_C_PRICE;
            case 'D' -> TYPE_D_PRICE;
            default -> -1;
        };
    }

    /**
     * Calculate the total price for this Rent.
     *
     * @return The total price of the rent.
     */
    public int getPrice() {
        final int DAYS = howManyDays();
        final int DAILY_PRICE = Rent.getPriceOfType(_car.getType());
        final int WEEKLY_PRICE = (DAILY_PRICE * DAYS_IN_A_WEEK) * (100 - WEEKLY_DISCOUNT) / 100;
        return (DAYS / 7) * WEEKLY_PRICE + (DAYS % 7) * DAILY_PRICE;
    }

    /**
     * The method receives Car object and checks if it's a better car
     * than the current one, if so it replaces the car with the new one
     * and return the price differences now that it's a better car.
     *
     * @param newCar: The new car object.
     * @return The price differences if the car is better, otherwise 0.
     */
    public int upgrade(Car newCar) {
        int currentPrice = getPrice();
        if (newCar.better(_car)) {
            _car = new Car(newCar);
            return getPrice() - currentPrice;
        }
        return 0;
    }

    /**
     * This method receives a Rent object and checks if there's a double listing of a rent for the same person and car
     * with an overlap between the two rents.
     * if so it returns a new Rent object with a unified date of both rents.
     *
     * @param other: The other Rent object.
     * @return if there's an overlap it returns a new Rent object, otherwise it returns `null`.
     */
    public Rent overlap(Rent other) {
        if (!(_car.equals(other.getCar()) && _name.equals(other.getName()))) {
            return null;
        }
        if (other.getPickDate().after(_returnDate) || other.getReturnDate().before(_pickDate)) {
            return null;
        }
        Date newPickDate = (_pickDate.before(other.getPickDate())) ? new Date(_pickDate) : new Date(other.getPickDate());
        Date newReturnDate = (_returnDate.after(other.getReturnDate())) ? new Date(_returnDate) : new Date(other.getReturnDate());
        return new Rent(_name, new Car(_car), newPickDate, newReturnDate);
    }

    /**
     * Returns a string representation of this Rent object.
     *
     * @return A string representation of this Rent object.
     */
    public String toString() {
        String fromToString = "From:" + _pickDate.toString() + " To:" + _returnDate.toString();
        String priceString = "Price:" + getPrice();
        String dayString = "Days:" + howManyDays();
        String carTypeString = "Type:" + _car.getType();
        return "Name:" + _name + " " + fromToString + " " + carTypeString + " " + dayString + " " + priceString;
    }
}
