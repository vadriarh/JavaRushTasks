package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String result = "";
        if (num == 0) {
            result = "ноль";
        }else{
            result=isPozitive(num)+isChet(num)+"число";
        }
        System.out.println(result);
    }

    public static String isChet(int a) {
        return a % 2 == 0 ? "четное " : "нечетное ";
    }

    public static String isPozitive(int a) {
        return a > 0 ? "положительное " : "отрицательное ";
    }
}
