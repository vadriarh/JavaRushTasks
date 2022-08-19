package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map=new HashMap<String, Integer>();
        map.put("Сталлоне", 1000);
        map.put("Аффлек", 1000);
        map.put("Миронов", 501);
        map.put("Леонов", 499);
        map.put("Портман", 1001);
        map.put("Редклиф", 1002);
        map.put("Вотсон", 2001);
        map.put("Камрбербетч", 2019);
        map.put("Фриман", 2020);
        map.put("Охлобыстин", 300);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        ArrayList<String>removeList=new ArrayList<String>();
        for (Map.Entry<String,Integer> entry:map.entrySet()) {
            if (entry.getValue()<500){
                removeList.add(entry.getKey());
            }
        }
        for (String removeName:removeList) {
            map.remove(removeName);
        }
    }

    public static void main(String[] args) {

    }
}