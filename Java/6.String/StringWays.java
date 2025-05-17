//1. Different ways creating a string
public class StringWays {
    public static void main(String[] args) {


        /*Using String Literals
        Stored in the String pool (part of heap memory).
        If two strings have the same literal value, they share the same memory.*/
        String s1 = "Farhan";
        String s2 = "Farhan";


        /* Using the new Keyword
        Always creates a new object in heap memory, even if the content is the same. */
        String s3 = new String("Hello");

        /*Using Character Array
        Converts a character array into a string. */
        char[] chars = { 'J', 'a', 'v', 'a' };
        String s4 = new String(chars);  // "Java"

        /*Using StringBuilder or StringBuffer
        Useful when building strings dynamically.
        Can convert the result into a String using .toString(). */

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        String s5 = sb.toString();  // "Hello World"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);


    }
}
