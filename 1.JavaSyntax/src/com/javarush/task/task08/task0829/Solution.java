package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String city;
        String family;
        Map<String, ArrayList<String>> map = new HashMap<>();
        while (true) {
            city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            family = reader.readLine();
            while (family.isEmpty()) {
                family = reader.readLine();
            }
            ArrayList<String> list = map.get(city);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(family);
            map.put(city, list);
        }

        city = reader.readLine();
        for (String familyResult : map.get(city)) {
            System.out.println(familyResult);
        }
    }
}
