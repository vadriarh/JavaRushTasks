package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String country;
        private String phoneNumber;

        public Human() {
        }

        public Human(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(int id, String firstName, String lastName, int age, String country, String phoneNumber) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.country = country;
            this.phoneNumber = phoneNumber;
        }

        public Human(int id) {
            this.id = id;
        }

        public Human(String firstName, String lastName, int age, String country, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.country = country;
            this.phoneNumber = phoneNumber;
        }

        public Human(String firstName, String lastName, String country) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.country = country;
        }

        public Human(int id, String firstName, String lastName, String phoneNumber) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }

        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(int id, int age, String country, String phoneNumber) {
            this.id = id;
            this.age = age;
            this.country = country;
            this.phoneNumber = phoneNumber;
        }
    }
}
