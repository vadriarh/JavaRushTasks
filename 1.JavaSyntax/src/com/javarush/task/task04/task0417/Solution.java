package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(reader.readLine());
        int num2=Integer.parseInt(reader.readLine());
        int num3=Integer.parseInt(reader.readLine());
        if(compare(num1,num2)){
            if (compare(num2,num3)){
                print(num1,num2,num3);
            }else{
                print(num1,num2);
            }
        }else if(compare(num1,num3)){
            if (compare(num2,num3)){
                print(num1,num2,num3);
            }else{
                print(num1,num3);
            }
        }else if(compare(num2,num3)){
            if(compare(num1,num3)){
                print(num1,num2,num3);
            }else{
                print(num2,num3);
            }
        }
    }
    public static boolean compare(int a,int b){
        return Math.abs(a)-Math.abs(b)==0;
    }
    public static void print(int...a){
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length-1]);
    }
}