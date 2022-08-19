package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();
        int number=0;
        for (int i = 0; i < str.length(); i++) {
            number=Integer.parseInt(String.valueOf(str.charAt(i)));
            if (number%2==0)    even++;
            else    odd++;
        }
        System.out.println(String.format("Even: %d Odd: %d",even,odd));
    }
}
