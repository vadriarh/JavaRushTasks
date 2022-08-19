package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        int sizeResult=(int)(Math.random()*11);
        int sizeTemp=(int)(Math.random()*11);
        ArrayList<String>[] resultStringList = new ArrayList[sizeResult];
        for (int i = 0; i < sizeResult; i++) {
            ArrayList<String> tempList=new ArrayList<>();
            for (int j = 0; j < sizeTemp; j++) {
                tempList.add(new String());
            }
            resultStringList[i]=tempList;
        }
        return resultStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}