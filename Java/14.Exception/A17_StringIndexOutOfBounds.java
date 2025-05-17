//17. Write a program to generate StringIndexOutOfBoundsException


public class A17_StringIndexOutOfBounds {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.charAt(10));
    }
}
