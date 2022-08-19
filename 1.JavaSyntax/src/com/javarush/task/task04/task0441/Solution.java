package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]mas=new int[3];

        for (int i = 0; i < mas.length; i++) {
            mas[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <mas.length ; i++) {
            for (int j = i; j <mas.length; j++) {
                if(mas[i]>mas[j]){
                    int temp=mas[j];
                    mas[j]=mas[i];
                    mas[i]=temp;
                }
            }
        }

        System.out.println(mas[1]);


    }

}
