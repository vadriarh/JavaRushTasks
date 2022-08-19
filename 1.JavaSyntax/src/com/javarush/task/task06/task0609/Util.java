package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double rX=Math.abs(x2-x1);
        double rY=Math.abs(y2-y1);
        return  Math.sqrt(Math.pow(rX,2)+Math.pow(rY,2));
    }

    public static void main(String[] args) {

    }
}
