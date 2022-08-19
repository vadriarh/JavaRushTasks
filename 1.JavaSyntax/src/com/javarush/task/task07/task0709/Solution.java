package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3.	Программа должна выводить самую короткую строку на экран.
4.	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings=new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int minLength=strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length()<minLength){
                minLength=strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length()==minLength){
                System.out.println(strings.get(i));
            }
        }

    }
}
