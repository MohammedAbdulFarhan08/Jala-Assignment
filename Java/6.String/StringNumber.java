//12. Converting Numbers to Strings with valueOf()

public class StringNumber {
    public static void main(String[] args) {
        int num = 100;
        double pi = 3.14159;
        boolean isJavaFun = true;

        String s1 = String.valueOf(num);
        String s2 = String.valueOf(pi);
        String s3 = String.valueOf(isJavaFun);

        System.out.println("Integer to String: " + s1);
        System.out.println("Double to String: " + s2);
        System.out.println("Boolean to String: " + s3);
    }
}


