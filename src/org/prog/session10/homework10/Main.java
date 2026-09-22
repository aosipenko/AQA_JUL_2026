package org.prog.session10.homework10;


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

        android1.color = "red";
        android2.color = "red";
        android3.color = "black";

        apple1.color = null;
        apple2.color = "white";
        apple3.color = "golden";

        android1.model = "Galaxy 1";
        android2.model = "Galaxy 2";
        android3.model = "Galaxy 3";

        apple1.model = "IPhone 1";
        apple2.model = "IPhone 2";
        apple3.model = "IPhone 3";

        System.out.println(android1);
        System.out.println(android2);
        System.out.println(android3);

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);

        System.out.println(" ");
        System.out.println("↓ EQUALS ↓");
        System.out.println("Does Color "+android1.model+" equal to "+android2.model+"? → "+android1.equals(android2));
        System.out.println("Does Color "+android2.model+" equal to "+android3.model+"? → "+android2.equals(android3));
        System.out.println("Does Color "+android3.model+" equal to "+apple1.model+"? → "+android3.equals(apple1));

        try {
            System.out.println("Does Color "+apple1.model+" equal to "+apple2.model+"? → "+apple1.equals(apple2));
        }catch (PhoneException e){
            System.err.println("Что-то тут не то1");
        }

        try {
            System.out.println("Does Color "+apple2.model+" equal to "+apple3.model+"? → "+apple2.equals(apple3));
        }catch (PhoneException e){
            System.err.println("Что-то тут не то2");
        }

        try {
            System.out.println("Does Color "+apple3.model+" equal to "+apple1.model+"? → "+apple3.equals(apple2));
        }catch (PhoneException e){
            System.err.println("Что-то тут не то3");
        }



        System.out.println(" ");
        System.out.println("↓ Color HashCode ↓");
        System.out.println(android1.model+" color HashCode → "+android1.hashCode());
        System.out.println(android2.model+" color HashCode → "+android2.hashCode());
        System.out.println(android3.model+" color HashCode → "+android3.hashCode());

        try {
            System.out.println(apple1.model+" color HashCode → "+apple1.hashCode());
        }catch (PhoneException e){
            System.err.println("Поймал исключение1");
        }
        try {
            System.out.println(apple2.model+" color HashCode → "+apple2.hashCode());
        }catch (PhoneException e){
            System.err.println("Поймал исключение2");
        }
        try {
            System.out.println(apple3.model+" color HashCode → "+apple3.hashCode());
        }catch (PhoneException e){
            System.err.println("Поймал исключение3");
        }

    }
}
