package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        int pozitive=0;
        int negative=0;
        for (int i = 0; i < 3; i++) {
            if(mass[i]!=0){
                if(mass[i]>0){
                    pozitive++;
                }else{
                    negative++;
                }
            }
        }
        System.out.println("количество отрицательных чисел: "+negative);
        System.out.println("количество положительных чисел: "+pozitive);

    }
}
