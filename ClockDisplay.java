import java.time.LocalTime;

public class ClockDisplay {
    private NumberDisplay hours = new NumberDisplay(24);
    private NumberDisplay minutes = new NumberDisplay(60);
    private NumberDisplay seconds = new NumberDisplay(60);

    public void setTimeToNow() {
        LocalTime now = LocalTime.now();
        hours.setValue(now.getHour());
        minutes.setValue(now.getMinute());
        seconds.setValue(now.getSecond());
    }

    public String getTime() {
        return hours.getDisplayValue() + ":" +
               minutes.getDisplayValue() + ":" +
               seconds.getDisplayValue();
    }
}
