package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int[]mass={num1,num2,num3};
        int res=0;
        for (int i = 0; i < 3; i++) {
            if(mass[i]!=0&&mass[i]>0){
                res++;
            }
        }
        System.out.println(res);
    }
}
