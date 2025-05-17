//11. Splitting strings with split()

public class StringSplit {
    public static void main(String[] args) {
        String s1 = "Hello World";

        // Split the string by space
        String[] parts = s1.split(" ");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}

