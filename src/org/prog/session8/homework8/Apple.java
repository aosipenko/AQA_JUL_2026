package org.prog.session8.homework8;

public class Apple implements IPhone{
    @Override
    public void unlock() {
        System.out.println("I was unlock with faceid");
    }

    public String color;
    public String model;

    @Override
    public String toString() {
        return "Phone [model = " + model + ", color = " + color + "]";
    }
}
