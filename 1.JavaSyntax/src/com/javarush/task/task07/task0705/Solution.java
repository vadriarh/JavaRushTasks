package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];

        for (int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        int[] minArr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            minArr1[i] = bigArray[i];
        }

        int[] minArr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            minArr2[i] = bigArray[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(minArr2[i]);
        }
    }
}
