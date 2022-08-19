package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Примин", dateFormat.parse("JANUARY 10 2012"));
        map.put("Секундантов", dateFormat.parse("FEBRUARY 11 2012"));
        map.put("Тертичный", dateFormat.parse("MARCH 12 2012"));
        map.put("Квадратов", dateFormat.parse("APRIL 13 2012"));
        map.put("Пентанов", dateFormat.parse("MAY 14 2012"));
        map.put("Секстантов", dateFormat.parse("JUNE 15 2012"));
        map.put("Септин", dateFormat.parse("JULY 16 2012"));
        map.put("Октин", dateFormat.parse("AUGUST 17 2012"));
        map.put("Нонин", dateFormat.parse("SEPTEMBER 18 2012"));
        map.put("Декартов", dateFormat.parse("OCTOBER 19 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        List<String>listKeys=new ArrayList<String>();
        for (Map.Entry<String, Date> entry :map.entrySet()) {
            Date date=entry.getValue();
            if(date.before(dateFormat.parse("SEPTEMBER 1 2012"))&&
                    date.after(dateFormat.parse("MAY 31 2012"))){
                listKeys.add(entry.getKey());
            }
        }
        for (String key:listKeys) {
            map.remove(key);
        }

    }

    public static void main(String[] args) throws ParseException {

    }
}
