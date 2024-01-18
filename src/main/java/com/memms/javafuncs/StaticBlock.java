package com.memms.javafuncs;

public class StaticBlock {

    static int x = 5;
    static int y;

    static int z = setZ();

    public StaticBlock(){
        System.out.println("This is a constructor");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("y value was set to x*5 in the static block itself as both x and y are static.");
        System.out.println("The variable needs to have the static keyword if it is to be used in a static block");

        System.out.println("z: " + z);
        System.out.println("z value was set to x*y in a static method as both x, y, z, and setZ() are static.");
        System.out.println("Notice that java runs code in the order it is written in the class file");
        System.out.println("Thus, setZ() is called before the static block itself resulting in z=0 instead of z=125.");
    }

    static {
        System.out.println("This is a static block");
        y = x * 5;
    }

    private static int setZ(){
        return x * y;
    }

    static class StaticClass {
        public void printXYZ() {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);
        }
    }
}
