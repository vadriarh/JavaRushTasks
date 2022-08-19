package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(reader.readLine());
        int num2=Integer.parseInt(reader.readLine());
        int num3=Integer.parseInt(reader.readLine());
        int result=0;
        if(compare(num1,num2)){
            result=3;
        }else if(compare(num1,num3)){
            result=2;
        }else if(compare(num2,num3)){
            result=1;
        }
        if(result!=0){
            System.out.println(result);
        }

    }
    public static boolean compare(int a,int b){
        return a==b;
    }
}
