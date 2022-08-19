package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(reader.readLine());
        int num2=Integer.parseInt(reader.readLine());
        int num3=Integer.parseInt(reader.readLine());
        int[]mass={num1,num2,num3};
        for (int i = 0; i < mass.length; i++) {
            for (int j = i+1; j <mass.length ; j++) {
                if (mass[i]<mass[j]){
                    int temp=mass[i];
                    mass[i]=mass[j];
                    mass[j]=temp;
                }

            }
        }
        print(mass);
    }

    public static void print(int[]mass){
        for (int i = 0; i < mass.length-1; i++) {
            System.out.print(mass[i]+" ");
        }
        System.out.println(mass[mass.length-1]);
    }
}
