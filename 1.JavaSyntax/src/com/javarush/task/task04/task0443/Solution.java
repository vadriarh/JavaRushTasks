package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        int y=Integer.parseInt(reader.readLine());
        int m=Integer.parseInt(reader.readLine());
        int d=Integer.parseInt(reader.readLine());
        System.out.println(String.format("Меня зовут %s.\nЯ родился %d.%d.%d",name,d,m,y));


    }
}
