package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int row=1,column=1;

        while(row<11){
            while(column<11){
                System.out.print(row*column+" ");
                column++;
            }
            column=1;
            System.out.println();
            row++;
        }

    }
}
