package com.memms.javafuncs;

public class SuperKey extends InnerSuperClass{

    public SuperKey() {
        super();
        System.out.println("This is the super key class");
    }

    public int getX() {
        return super.x;
    }

    public int getXVar() {
        return super.x;
    }
}

class InnerSuperClass {

    int x = 5;
    public InnerSuperClass() {
        System.out.println("This is the inner super class");
    }

    public int getX() {
        System.out.println("InnerSuperClass getX() called");
        return x;
    }

}