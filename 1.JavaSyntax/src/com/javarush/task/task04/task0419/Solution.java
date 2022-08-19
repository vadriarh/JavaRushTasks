package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(reader.readLine());
        int num2=Integer.parseInt(reader.readLine());
        int num3=Integer.parseInt(reader.readLine());
        int num4=Integer.parseInt(reader.readLine());
        System.out.println(max(max(num1,num2),max(num3,num4)));
    }

    public static int max(int a,int b){
        return a>=b?a:b;
    }
}
