package JavaRush;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

    public static void main(String[] args) {
        SimpleDateFormat formater = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();


        System.out.println(formater.format(date));
    }
}
