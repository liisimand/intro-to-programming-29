package org.example;

public class IfElseExample {

    public static void main(String[] args) {
        System.out.println("Let's make decision. Are you adult or kid?");

        int age = 20;
        if (age >= 18) {
            System.out.println("i'm adult");
        }

        if (age < 18) {
            System.out.println("just a kid");

        }
        if (age >= 18) {
            System.out.println("If is true");
            System.out.println("Adult");
        } else {
            System.out.println("Else, if was false");
            System.out.println("Kid");
        }

    }
}