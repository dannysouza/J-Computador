package computercerto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Date {

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = checkDay(day);
        this.year = year;
    }

    private int checkDay(int day) {
        if (day > 0 && day <= Date.DAYS_PER_MONTH[month]) {
            return day;
        }

        if (month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            return day;
        }
        JOptionPane.showMessageDialog(null, "Invalid day!");

        return 1;
    }

    public void currentDateTime(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        JOptionPane.showMessageDialog(null,sdf.format(cal.getTime()));
    }
    
    public void displayDate(){
        JOptionPane.showMessageDialog(null, day + "/" + month + "/" + year);
    }   
    
    private int month, day, year;

    private final static int[] DAYS_PER_MONTH = {0, 31, 28, 31, 30, 30, 31, 31, 30, 31, 30, 31};
}
