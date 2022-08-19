package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Объяви переменную типа список строк и сразу проинициализируй ee.
3. Добавь в список слова: «мама», «мыла», «раму».
4. После каждого слова добавь в список строку, содержащую слово «именно».
5. Выведи элементы списка на экран, каждый с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings=new ArrayList<String>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        strings.add(1,"именно");
        strings.add(3,"именно");
        strings.add("именно");
        for (String str :
                strings) {
            System.out.println(str);
        }
    }
}
