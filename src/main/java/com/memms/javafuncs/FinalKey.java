package com.memms.javafuncs;

public class FinalKey extends innerClass{
    private final int x = 5;

    public FinalKey() {
        System.out.println("This is a final class");
        // final variables cannot be changed
        // x = 10;

    }


//    final methods cannot be overridden
//    private String printString() {
//        return "This is a final method";
//    }
}


// final class cannot be extended
//public class finalKey extends innerFinalClass{
//
//}

class innerClass{
    public innerClass() {
        System.out.println("This is an inner class");
    }

    final String printString() {
        return "This is a final method";
    }
}


final class innerFinalClass{
    public innerFinalClass() {
        System.out.println("This is a final class");
    }
}
