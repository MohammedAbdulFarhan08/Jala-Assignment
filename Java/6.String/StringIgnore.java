//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

public class StringIgnore {
    public static void main(String[] args) {
        String s1 = "Farhan";
        String s2 = "farhan";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.compareTo(s2));
    }
}
