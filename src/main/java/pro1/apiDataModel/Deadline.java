package pro1.apiDataModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deadline {
    public String value;

    public Date getDate()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = format.parse(this.value); // 12.4.2014
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
