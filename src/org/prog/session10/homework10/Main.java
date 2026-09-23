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

        android1.color = null;
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
        try {
            System.out.println("Does Color "+android1.model+" equal to "+android2.model+"? → "+android1.equals(android2));
        }catch (PhoneException e){
            System.out.println("Поймал исключение при сравнении моделей "+android1.model+" и "+android2.model);
        }

        try {
            System.out.println("Does Color "+android2.model+" equal to "+android3.model+"? → "+android2.equals(android3));
        }catch (PhoneException e){
            System.out.println("Поймал исключение при сравнении моделей "+android2.model+" и "+android3.model);
        }

        try {
            System.out.println("Does Color "+android3.model+" equal to "+android1.model+"? → "+android3.equals(android1));
        }catch (PhoneException e){
            System.out.println("Поймал исключение при сравнении моделей "+android3.model+" и "+android1.model);
        }


        try {
            System.out.println("Does Color "+apple1.model+" equal to "+apple2.model+"? → "+apple1.equals(apple2));
        }catch (PhoneException e){
            System.out.println("Поймал исключение при сравнении моделей "+apple1.model+" и "+apple2.model);
        }

        try {
            System.out.println("Does Color "+apple2.model+" equal to "+apple3.model+"? → "+apple2.equals(apple3));
        }catch (PhoneException e){
            System.out.println("Поймал исключение при сравнении моделей "+apple2.model+" и "+apple3.model);
        }

        try {
            System.out.println("Does Color "+apple3.model+" equal to "+apple1.model+"? → "+apple3.equals(apple2));
        }catch (PhoneException e){
            System.out.println("Поймал исключение при сравнении моделей "+apple3.model+" и "+apple1.model);
        }



        System.out.println(" ");
        System.out.println("↓ Color HashCode ↓");
        try {
            System.out.println(android1.model+" color HashCode → "+android1.hashCode());
        }catch (PhoneException e){
            System.out.println("Поймал исключение для android1");
        }
        try {
            System.out.println(android2.model+" color HashCode → "+android2.hashCode());
        }catch (PhoneException e){
            System.out.println("Поймал исключение для android2");
        }
        try {
            System.out.println(android3.model+" color HashCode → "+android3.hashCode());
        }catch (PhoneException e){
            System.out.println("Поймал исключение для android3");
        }


        try {
            System.out.println(apple1.model+" color HashCode → "+apple1.hashCode());
        }catch (PhoneException e){
            System.out.println("Поймал исключение для apple1");
        }
        try {
            System.out.println(apple2.model+" color HashCode → "+apple2.hashCode());
        }catch (PhoneException e){
            System.out.println("Поймал исключение для apple2");
        }
        try {
            System.out.println(apple3.model+" color HashCode → "+apple3.hashCode());
        }catch (PhoneException e){
            System.out.println("Поймал исключение для apple3");
        }

    }
}
