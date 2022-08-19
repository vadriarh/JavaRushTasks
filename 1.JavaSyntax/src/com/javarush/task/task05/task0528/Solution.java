package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        System.out.println(LocalDate.now().getDayOfMonth()+" "+
                LocalDate.now().getMonth().getValue()+" "+
                LocalDate.now().getYear());
    }
}
