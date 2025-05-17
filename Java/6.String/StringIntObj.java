//13. Converting integer objects to Strings

public class StringIntObj {
    public static void main(String[] args) {
        Integer num = 456;

        String str1 = String.valueOf(num);
        String str2 = num.toString();
        String str3 = num + "";

        System.out.println("Using valueOf(): " + str1);
        System.out.println("Using toString(): " + str2);
        System.out.println("Using concatenation: " + str3);
    }
}


