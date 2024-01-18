package com.memms.javafuncs.protectedPackage;

public class ProtectedClass extends ProtectedInnerClass{
    public ProtectedClass(){
        System.out.println("This is the protected class");

        System.out.println("Since we are in the same package, protectedPackage, we can access the protected variable x of ProtectedInnerClass");
        System.out.println("super.x = " + super.x);
        System.out.println("We can also access the protected method printX() of ProtectedInnerClass");
        super.printX();

    }
}
