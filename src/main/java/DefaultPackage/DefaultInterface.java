package DefaultPackage;

public interface DefaultInterface {
    void printX();

    default void printY() {
        System.out.println("This is the default method printY() in the DefaultInterface");
    }
}
