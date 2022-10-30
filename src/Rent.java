public class Rent {
    private String _name;
    private Car _car;
    private Date _pickDate;
    private Date _returnDate;

    private final int TYPE_A_PRICE = 100;
    private final int TYPE_B_PRICE = 150;
    private final int TYPE_C_PRICE = 180;
    private final int TYPE_D_PRICE = 240;
    private final int WEEKLY_DISCOUNT = 10;// 10% discount for weekly rent (7 days)
    private final int DAYS_IN_A_WEEK = 7;

    public Rent(String name, Car car, Date pickDate, Date returnDate) {
        _name = name;
        _car = car;
        _pickDate = pickDate;
        _returnDate = returnDate;
    }
    public Rent(Rent other) {
        _name = other._name;
        _car = other._car;
        _pickDate = other._pickDate;
        _returnDate = other._returnDate;
        if (_pickDate.after(_returnDate))
            _returnDate = _pickDate.tomorrow();

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
    public boolean equals(Rent other){
        return _name.equals(other._name) && _car.equals(other._car) && _pickDate.equals(other._pickDate) && _returnDate.equals(other._returnDate);
    }
    public int howManyDays(){
        return _pickDate.difference(_returnDate);
    }

    private int getPriceOfType(char type){
        return switch (type) {
            case 'A' -> TYPE_A_PRICE;
            case 'B' -> TYPE_B_PRICE;
            case 'C' -> TYPE_C_PRICE;
            case 'D' -> TYPE_D_PRICE;
            default -> -1;
        };
    }
    public int getPrice(){
        final int DAYS = howManyDays();
        final int DAILY_PRICE = getPriceOfType(_car.getType());
        final int WEEKLY_PRICE = (DAILY_PRICE*DAYS_IN_A_WEEK)*(100-WEEKLY_DISCOUNT)/100;
        return (DAYS/7)*WEEKLY_PRICE + (DAYS%7)*DAILY_PRICE;
    }
    // TODO: add upgrade, overlap and toString methods to the Rent class, also after you finish get rid of the main method
    public static void main(String[] args) {
        Car car = new Car(1234567, 'A', "Toyota", true);
        Date pickDate = new Date(1, 1, 2020);
        Date returnDate = new Date(16, 1, 2020);
        Rent rent = new Rent("John", car, pickDate, returnDate);
        System.out.println(rent.getPrice());
    }
}
