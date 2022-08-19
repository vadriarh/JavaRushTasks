package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Human son1 = new Human("Son#1", true, 12, null);
        Human son2 = new Human("Son#2", true, 14, null);
        Human daughter1 = new Human("Daughter#1", false, 8, null);
        ArrayList<Human> grandChild = new ArrayList<Human>();
        grandChild.add(son1);
        grandChild.add(son2);
        grandChild.add(daughter1);
        Human mother = new Human("Mother", false, 38, grandChild);
        Human father = new Human("Father", true, 42, grandChild);
        ArrayList<Human> childMother = new ArrayList<Human>();
        childMother.add(mother);
        ArrayList<Human> childFather = new ArrayList<Human>();
        childFather.add(father);
        Human grandMaF = new Human("GrandMaFather", false, 65, childFather);
        Human grandMaM = new Human("GrandMaMother", false, 62, childMother);
        Human grandPaF = new Human("GrandPaFather", true, 67, childFather);
        Human grandPaM = new Human("GrandPaMother", true, 65, childMother);
        ArrayList<Human> family = new ArrayList<Human>();
        family.add(grandPaF);
        family.add(grandPaM);
        family.add(grandMaF);
        family.add(grandMaM);
        family.add(father);
        family.add(mother);
        family.add(son1);
        family.add(daughter1);
        family.add(son2);
        for (Human human :
                family) {
            System.out.println(human);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (children!=null){
                this.children = children;
            }else{
                this.children=new ArrayList<Human>();
            }

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
