/*1. Print the fields/instance members of the current class using this and without using objec */

public class ThisKeywordDemo {
    int x = 10;

    void display() {
        System.out.println("Value of x using this: " + this.x); // this refers to current object
    }

    public static void main(String[] args) {
        new ThisKeywordDemo().display(); // No reference variable used
    }
}
