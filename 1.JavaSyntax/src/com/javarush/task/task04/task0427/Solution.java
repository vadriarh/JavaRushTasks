package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if(num<1000&&num>0){
            String result = "число";
            result=isChet(num)+isRazr(num)+result;
            System.out.println(result);
        }
    }

    public static String isChet(int a) {
        return a % 2 == 0 ? "четное " : "нечетное ";
    }

    public static String isRazr(int a) {
        String result = "";
        int key = 0;
        for (int i = 0; i < 3; i++) {
            key = i+1;
            if (a / 10 < 1) {
                break;
            } else {
                a /= 10;
            }
        }
        switch (key) {
            case 1:
                result = "однозначное ";
                break;
            case 2:
                result = "двузначное ";
                break;
            case 3:
                result = "трехзначное ";
                break;
        }
        return result;
    }
}
