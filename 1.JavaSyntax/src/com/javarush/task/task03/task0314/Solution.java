package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            printRow(i);
        }

    }
    public static void printRow(int count){
        for (int i = 1; i < 10; i++) {
            System.out.print(count*i+" ");
        }
        System.out.println(count*10);
    }
}
