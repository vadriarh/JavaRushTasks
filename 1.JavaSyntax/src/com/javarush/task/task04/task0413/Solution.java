package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String result="";
        if(num<=7&&num>=1){
            switch (num){
                case 1:
                    result="понедельник";
                    break;
                case 2:
                    result="вторник";
                    break;
                case 3:
                    result="среда";
                    break;
                case 4:
                    result="четверг";
                    break;
                case 5:
                    result="пятница";
                    break;
                case 6:
                    result="суббота";
                    break;
                case 7:
                    result="воскресенье";
                    break;
            }

        }else {
            result="такого дня недели не существует";
        }
        System.out.println(result);
    }
}