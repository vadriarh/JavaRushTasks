package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String string = reader.readLine();
            if (0 == string.length()) break;
            int id = Integer.parseInt(string);
            String name = reader.readLine();
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
