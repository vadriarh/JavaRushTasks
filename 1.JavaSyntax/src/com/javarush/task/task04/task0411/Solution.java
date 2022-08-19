package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        String result="";
        if (month >= 1 && month <= 5) {
            if (month <= 2)
                result="зима";
            else
                result="весна";
        } else if (month == 12) {
            result="зима";
        } else if (month <= 8) {
            result="лето";
        } else {
            result="осень";
        }
        System.out.println(result);
    }
}