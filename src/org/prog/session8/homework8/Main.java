package org.prog.session8.homework8;

public class Main {
    public static void main(String[] args) {
        Android samsung = new Android();
        Apple apple = new Apple();

        samsung.unlock();
        apple.unlock();

        Android android1 = new Android();
        Android android2 = new Android();
        Android android3 = new Android();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        android1.color = "green";
        android2.color = "green";
        android3.color = "black";

        apple1.color = "white";
        apple2.color = "white";
        apple3.color = "golden";

        android1.model = "galaxy 1";
        android2.model = "galaxy 2";
        android3.model = "galaxy 3";

        apple1.model = "model 1";
        apple2.model = "model 2";
        apple3.model = "model 3";

        System.out.println(android1);
        System.out.println(android2);
        System.out.println(android3);

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);

    }
}
