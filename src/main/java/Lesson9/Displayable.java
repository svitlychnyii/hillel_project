package Lesson9;

interface Displayable {
    void displayInformation();
    default void displayInformation(String prefix) {
        System.out.println(prefix);
    }
}
