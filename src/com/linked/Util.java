package com.linked;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static Date toDate(String dateStr) {
        Date date = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String toString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = simpleDateFormat.format(date);
        return dateStr;
    }

}
