package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person me = new Person("Alejandro", new Date(95, 2, 27));
        System.out.println(me.getName()+ " tiene " + me.getAge() + " años.");
    }
    
}