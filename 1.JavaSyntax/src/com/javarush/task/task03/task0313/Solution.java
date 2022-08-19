package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String s1="Мама";
        String s2="Мыла";
        String s3="Раму";
        printList(s1,s2,s3);
        printList(s1,s3,s2);
        printList(s2,s1,s3);
        printList(s2,s3,s1);
        printList(s3,s2,s1);
        printList(s3,s1,s2);

    }

    public static void printList(String s1,String s2,String s3){
        System.out.println(s1+""+s2+s3);
    }
}
