package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(reader.readLine());
        num=num==0?0:(num>0?num*2:num+1);
        System.out.println(num);

    }

}