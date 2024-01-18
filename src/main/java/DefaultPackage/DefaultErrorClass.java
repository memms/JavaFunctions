package DefaultPackage;

public class DefaultErrorClass implements DefaultInterface {
    @Override
    public void printX() {
        System.out.println("This is the printX() method in the DefaultOuterClass");
    }

    static void printZ() {
        System.out.println("This is the printZ() method in the DefaultOuterClass");
    }



}
