package com.memms.javafuncs;

import com.memms.javafuncs.protectedPackage.ProtectedInnerClass;

public class ProtectedOuterClass extends ProtectedInnerClass {
    public ProtectedOuterClass(){
        System.out.println("This is the protected outer class");
        super.printX();
    }

}
