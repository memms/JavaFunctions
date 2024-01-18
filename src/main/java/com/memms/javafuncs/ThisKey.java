package com.memms.javafuncs;

public class ThisKey {

    int x = 5;

    public ThisKey() {
        System.out.println("No parameter constructor called due to this() in parameter constructor");
    }

    public ThisKey(int x) {
        this();
        setX(x);
        System.out.println("parameter x: " + x + " and instance variable x: " + this.x + " after x = x");
        setThisX(x);
        System.out.println("parameter x: " + x + " and instance variable x: " + this.x + " after this.x = x");

    }

    private void setX(int x){
        x = x;
    }

    private void setThisX(int x) {
        this.x = x;
    }

    public ThisKey getObj() {
        return this;
    }

    public void printObj(Object obj) {
        System.out.println("Object: " + obj);
    }

}
