//3. Calculate the day of the month by using java.
import java.util.Calendar;

public class dayofmonth {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
    
        System.out.println("Day of the month: " + dayOfMonth);
    }
}
