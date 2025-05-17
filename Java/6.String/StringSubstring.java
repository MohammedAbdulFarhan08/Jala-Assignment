//4. Extract a string using Substring

public class StringSubstring {
    public static void main(String[] args) {
        String s1 = new String("HelloWorld");
        String sub1 = s1.substring(5);
        String sub2 = s1.substring(0,5);
        System.out.println(sub1);
        System.out.println(sub2);
    }
}
