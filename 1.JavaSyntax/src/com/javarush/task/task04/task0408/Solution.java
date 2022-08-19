package com.javarush.task.task04.task0408;

/* 
Хорошо или плохо?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        String result=(a>5?"больше":(a==5?"равно":"меньше"));
        System.out.println("Число " + result + " 5");
    }
}