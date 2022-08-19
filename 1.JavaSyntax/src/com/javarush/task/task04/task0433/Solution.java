package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int row=10,columns=10;
        while(row>0){
            while(columns>0){
                System.out.print("S");
                columns--;
            }
            columns=10;
            System.out.println();
            row--;
        }

    }
}
