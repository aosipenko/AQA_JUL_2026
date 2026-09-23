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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Apple) {
            Apple a = (Apple) obj;
            boolean isEqual = this.color.equals(a.color);
            return isEqual;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.color.hashCode();
    }
}
