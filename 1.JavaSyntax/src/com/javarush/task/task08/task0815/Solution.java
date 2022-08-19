package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map=new HashMap<String, String>();
        map.put("Аврамишин", "Станислав");
        map.put("Бернадский", "Серафим");
        map.put("Котик", "Дмитрий");
        map.put("Царук", "Вьячеслав");
        map.put("fgdgк", "Владислав");
        map.put("Бартош", "Андрей");
        map.put("Жмурак", "Анатолий");
        map.put("Красько", "Владислав");
        map.put("Ковальчук", "Руслан");
        map.put("Волошин", "Иван");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count=0;
        for (Map.Entry<String,String> entry:map.entrySet()) {
            if (name.equals(entry.getValue())){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count=0;
        for (Map.Entry<String,String> entry:map.entrySet()) {
            if (lastName.equals(entry.getKey())){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
