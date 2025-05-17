//6. Matching a String Against a Regular Expression With matches()

public class StringMatches {
    public static void main(String[] args) {
        String s1 = "abc123";

        // Matches lowercase letters followed by digits
        boolean result = s1.matches("[a-z]+[0-9]+");

        System.out.println("Match result: " + result);
    }
}


