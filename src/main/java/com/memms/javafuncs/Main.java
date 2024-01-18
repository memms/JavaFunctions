package com.memms.javafuncs;

import DefaultPackage.*;
import com.memms.javafuncs.Abstracts.AdultAbstract;
import com.memms.javafuncs.Abstracts.HumanAbstract;
import com.memms.javafuncs.DataStructures.Linear.Array;
import com.memms.javafuncs.Inheritence.GeneralTest;
import com.memms.javafuncs.Inheritence.Hierarchical.TestC;
import com.memms.javafuncs.Inheritence.Results;
import com.memms.javafuncs.Inheritence.TestA;
import com.memms.javafuncs.Interfaces.Human;
import com.memms.javafuncs.Polymorph.Adult;
import com.memms.javafuncs.Polymorph.Person;
import com.memms.javafuncs.protectedPackage.ProtectedClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to a Java Basics Repo!");
        System.out.println("First we will look at the 'this' keyword use in java");
        System.out.println("This will be taking place from the class: ThisKey.java");
        ThisKey thisKey = new ThisKey(10);
        System.out.println("This can be used to also return class objects");
        System.out.println(thisKey.getObj());
        System.out.println("This can also be passed inside a parameter to a method");
        thisKey.printObj(thisKey.getObj());
        System.out.println();

        System.out.println("Next we will look at the 'final' keyword use in java");
        System.out.println("This will be taking place from the class: FinalKey.java; Suggested to read comments");
        FinalKey finalKey = new FinalKey();
        System.out.println();

        System.out.println("Next we will look at the 'static' keyword use in java");
        System.out.println("This will be taking place from the class: StaticBlock.java");
        System.out.println("Static blocks are run during class loading, thus even before constructors are called");
        StaticBlock staticBlock = new StaticBlock();
        System.out.println("Static classes can be used to access static variables of the outer class");
        StaticBlock.StaticClass staticClass = new StaticBlock.StaticClass();
        staticClass.printXYZ();
        System.out.println();

        System.out.println("Next we will look at the 'super' keyword use in java");
        System.out.println("This will be taking place from the class: SuperKey.java");
        System.out.println("Super is used to access the parent class methods");
        System.out.println("Here since super() is in constructor of SuperKey class, it will call the constructor of the parent class");
        SuperKey superKey = new SuperKey();
        System.out.println("super.getX() = " + superKey.getX());
        System.out.println("super can also be used to access the parent class variables");
        System.out.println("super.x = " + superKey.getXVar());
        System.out.println();

        System.out.println("Next, we will look at protected access modifier");
        System.out.println("This will be taking place from files with Protected*");
        System.out.println("Protected is used to allow access to the class variables and methods to the classes in the same package");
        new ProtectedClass();
        System.out.println("Similarly protected works with subclasses as well (extends)");
        new ProtectedOuterClass();
        System.out.println("However, if we were to call the protected method printX() from Main, we would get an error");
//        ProtectedInnerClass protectedInnerClass = new ProtectedInnerClass();
//        protectedInnerClass.printX();
        System.out.println();

        System.out.println("Next, we will look at the default access modifier");
        System.out.println("This will be taking place from files with Default*");
        DefaultClass defaultClass = new DefaultClass();
        System.out.println("Default is used to allow access to the class variables and methods to the classes in the same package");
        defaultClass.printY();
        System.out.println("However, if we were to call the default method from DefaultOuterClass, it would throw an error");
//        DefaultErrorClass.printZ();
        System.out.println();

        System.out.println("Next, we will look at opperators in java");
        System.out.println("This will be taking place from files with Opperators.java");
        Opperators opperators = new Opperators();
        System.out.println("Here are some examples of opperators in Java");
        System.out.println("f(5)=x++ = " + opperators.addOne(5));
        System.out.println("f(5)=x-- = " + opperators.subtractOne(5));
        System.out.println("f(true)=!x = " + opperators.negate(true));
        System.out.println("f(5, 10)=x+y = " + opperators.add(5, 10));
        System.out.println("f(5, 10)=x-y = " + opperators.subtract(5, 10));
        System.out.println("f(5, 10)=x*y = " + opperators.multiply(5, 10));
        System.out.println("f(5, 10)=x/y = " + opperators.divide(5, 10));
        System.out.println("f(5, 10)=x%y = " + opperators.modulus(5, 10));
        System.out.println("f(5, 10)=(x+=y) = " + opperators.plusBy(5, 10));
        System.out.println("f(5, 10)=(x-=y) = " + opperators.minusBy(5, 10));
        System.out.println("f(5, 10)=(x*=y) = " + opperators.multiplyBy(5, 10));
        System.out.println("f(5, 10)=(x/=y) = " + opperators.divideBy(5, 10));
        System.out.println("f(5, 10)=(x%=y) = " + opperators.modulusBy(5, 10));
        System.out.println("Terenary opperator: (x > y) ? x : y = " + opperators.terenaryMax(5, 10));
        System.out.println("There are many more opperators in the Opperators.java file");
        System.out.println();

        System.out.println("Next, we will look at inheritence in java");
        System.out.println("Here we will start by creating a new Results object and call it's multilevel inheritence methods");
        Results results = new Results();
        results.insideResults();
        results.insideTestA();
        results.insideGeneralTest();
        System.out.println();

        System.out.println("Next, we will look at hierarchical inheritence in java");
        System.out.println("Here we will start by creating a new TestC object and call it's hierarchical inheritence methods");
        TestC testC = new TestC();
        testC.insideHierarchical();
        testC.insideTestC();
        System.out.println("Notice that TestC does not have access to TestD and TestB methods as those are on the same level as TestC");
        System.out.println("Note: JAVA does not support multiple inheritence via classes as two classes on same level can have same method names which would cause ambiguity");
        System.out.println("Note: However JAVA does support multiple inheritence through interfaces");
        System.out.println();

        System.out.println("Next, we will look at polymorphism in java");
        Person newPerson = new Person();
        Person newAdult = new Adult();
        System.out.println(newPerson.read());
        System.out.println(newAdult.read());
        System.out.println();

        System.out.println("Next, we will look at abstract classes in java");
        System.out.println("This will be taking place from files with Abstracts package");
        System.out.println("Abstract classes are classes that cannot be instantiated");
        HumanAbstract humanAbstract = new AdultAbstract();
        System.out.println(humanAbstract.read());
        System.out.println(humanAbstract.walk());
        System.out.println(humanAbstract.sleep());
        System.out.println("Notice that AdultAbstract class uses sleep method from HumanAbstract class");
        System.out.println("Notice that AdultAbstract class uses walk method from AdultAbstract class");
        System.out.println("Notice that AdultAbstract class uses read method from AdultAbstract class");
        System.out.println("Thus, with abstracts you can use polymorphism to use the same method name but different implementations");
        System.out.println("Furthermore you can use abstract classes to define methods that must be implemented by the child classes (read method in HumanAbstract)");
        System.out.println("We can also override methods already defined in the abstract class (walk method in AdultAbstract)");
        System.out.println("Lastly, if the child class has not overriden the method, that method can still be called but it will use the code from the abstract class (sleep method in HumanAbstract)");
        System.out.println("Note: JAVA does not support multiple inheritence via classes as two classes on same level can have same method names which would cause ambiguity. This includes abstract classes.");
        System.out.println();

        System.out.println("Next, we will look at Interfaces in java");
        System.out.println("This will be taking place from files with Interfaces package");
        Human human = new Human();
        System.out.println(human.run());
        System.out.println(human.walk());
        System.out.println("Notice that Human class implements both Running and Walking interfaces");
        System.out.println();

        System.out.println("Next, we will look at some data structures in java");
        System.out.println("This will be taking place from files with DataStructures package");
        System.out.println("First we will look at linear data structures, specifically arrays");
        System.out.println("This will be taking place from files with Linear package");
        Array array = new Array(1);
        array.printArray();
        System.out.println(array.addElement(10));
        System.out.println(array.addElement(20));
        System.out.println("Another type of array is a 2 dimensional array (array of arrays) which can be used to represent a matrix");
        Array array2 = new Array();
        array2.print2DArray();

    }

    /**
     * This is a java doc comment
     * Use @ to add tags such as param, return, etc.
     */
    private void javaDocs(){
        // This is a regular comment
    }


}