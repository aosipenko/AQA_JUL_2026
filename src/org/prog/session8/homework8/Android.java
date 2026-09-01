package org.prog.session8.homework8;

public class Android implements IPhone{
    @Override
    public void unlock() {
        System.out.println("I was unlock with fingerprint");
    }

    public String color;
    public String model;

    @Override
    public String toString() {
        return "Phone [model = " + model + ", color = " + color + "]";

    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Android) {
            Android a = (Android) obj;
            boolean isEqual = this.color.equals(a.color);
            return isEqual;
        }
        return false;
    }
}
