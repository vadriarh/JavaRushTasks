package com.javarush.task.task08.task0802;

/* 
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<String, String>();
        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень");
        for (Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
