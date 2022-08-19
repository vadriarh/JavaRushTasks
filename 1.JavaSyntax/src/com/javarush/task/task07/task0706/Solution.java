package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]arr=new int[15];
        int chet=0,nechet=0;
        for (int i = 0; i < 15; i++) {
            arr[i]=Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {chet += arr[i];}
            else {nechet += arr[i];}
        }
        if (chet > nechet) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else if(chet!=nechet){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
