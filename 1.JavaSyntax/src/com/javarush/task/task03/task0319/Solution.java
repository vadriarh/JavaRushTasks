package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        int num1=Integer.parseInt(reader.readLine());
        int num2=Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}
