package src;
import java.time.LocalTime;
import java.util.ArrayList;

abstract class Clock {
    protected String brand;
    protected String color;
    protected LocalTime initialTime;

    public abstract void getTime();
    public abstract void setTime(LocalTime time);

    public static void main(String[] args) {
        DigitalClock digitalClock = new DigitalClock("Casio", "Black", LocalTime.now());
        digitalClock.getTime();
        digitalClock.setTime(LocalTime.of(12, 0));
        digitalClock.getTime();
        digitalClock.setAlarm(LocalTime.of(12,1));
        digitalClock.clockDisplay();
        digitalClock.delAlarm();
        digitalClock.clockDisplay();
    }
}

class DigitalClock extends Clock {

    protected LocalTime nextAlarmTime;
    public DigitalClock(String brand, String color, LocalTime initialTime) {
        this.brand = brand;
        this.color = color;
        this.initialTime = initialTime;
    }

    @Override
    public void getTime() {
        System.out.println("The time is " + this.initialTime);
    }

    @Override
    public void setTime(LocalTime time) {
        this.initialTime = time;
    }

    public void setAlarm(LocalTime time) {
        this.nextAlarmTime = time;
    }

    public void getAlarm() {
        System.out.println("The alarm is set for " + this.nextAlarmTime);
    }
    public void delAlarm() {
        this.nextAlarmTime = null;
    }
    public void clockDisplay() {
        System.out.println("The clock is a " + this.color + " " + this.brand + " digital clock");
        System.out.println("the next alarm is set for: " + (this.nextAlarmTime != null ? this.nextAlarmTime : "no alarm set"));
    }
}

