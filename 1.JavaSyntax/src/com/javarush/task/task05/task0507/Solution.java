package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int number=0, sum=0,count=0;

        while(true){
            number=Integer.parseInt(reader.readLine());
            if(number!=-1){
                sum+=number;
                count++;
            }else{
                System.out.println((double)sum/count);
                break;
            }
        }
    }
}

