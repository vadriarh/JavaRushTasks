package com.javarush.task.task08.task0827;



/* 
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date newDate=new Date(date);
        Date beginYear=new Date();
        beginYear.setMonth(0);
        beginYear.setDate(1);
        beginYear.setYear(newDate.getYear());
        long time=newDate.getTime()-beginYear.getTime();
        int days=(int)(time/(1000*60*60*24));
        return days%2!=0;
    }
}
