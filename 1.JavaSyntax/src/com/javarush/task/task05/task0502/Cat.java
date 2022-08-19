package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int count = 0;
        if (this.age != anotherCat.age) {
            if (this.age > anotherCat.age) count++;
            else count--;
        }
        if (this.weight != anotherCat.weight) {
            if (this.weight > anotherCat.weight) count++;
            else count--;
        }
        if (this.strength != anotherCat.strength) {
            if (this.strength > anotherCat.strength) count++;
            else count--;
        }

        return count > 0;
    }

    public static void main(String[] args) {

    }
}
