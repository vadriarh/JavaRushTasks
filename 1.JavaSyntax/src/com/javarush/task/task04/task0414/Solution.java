package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int days = 0;
        days = year % 400 == 0 ? 366 : (year%4==0&&year%100!=0?366:365);
        System.out.println("количество дней в году: " + days);
    }
}