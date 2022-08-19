package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать только три метода.
3. Метод createPeopleList() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map=new HashMap<String, String>();
        map.put("Жмурак", "Станислав");
        map.put("Бернадский", "Владислав");
        map.put("Котик", "Дмитрий");
        map.put("Царук", "Вьячеслав");
        map.put("Жмурак", "Владислав");
        map.put("Бартош", "Андрей");
        map.put("Жмурак", "Анатолий");
        map.put("Красько", "Владислав");
        map.put("Ковальчук", "Руслан");
        map.put("Волошин", "Иван");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
