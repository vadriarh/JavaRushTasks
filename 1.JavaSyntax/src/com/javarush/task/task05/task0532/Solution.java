package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum =Integer.parseInt(reader.readLine());
        int nCount=maximum,temp=0;
        if(nCount>0){
            maximum =Integer.parseInt(reader.readLine());
            for (int i = 1; i < nCount; i++) {
                temp=Integer.parseInt(reader.readLine());
                if(temp>maximum) maximum=temp;
            }
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
