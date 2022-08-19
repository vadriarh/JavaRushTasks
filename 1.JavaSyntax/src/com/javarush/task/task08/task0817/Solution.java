package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, Integer> nameCount = new HashMap<String, Integer>();
        for (String name:map.values()) {
            if (!nameCount.containsKey(name)){
                nameCount.put(name,1);
            }else{
                nameCount.put(name,nameCount.get(name)+1);
            }
        }
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue().intValue()>1) {
                removeItemFromMapByValue(map,entry.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
