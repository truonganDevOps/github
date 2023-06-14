package package_lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {

    public static Date parse(String text) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

        return formater.parse(text);
    }

    public static Date parse(String text, String pattern) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat(pattern);

        return formater.parse(text);
    }
}
