package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1995, 2, 27);
        
        Person me = new Person("Alejandro",date);
        System.out.println(me.getName() + " tiene " + me.getAge() + " años.");
    }
    
}