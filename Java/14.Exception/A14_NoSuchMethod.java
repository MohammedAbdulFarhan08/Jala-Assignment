//14. Write a program to generate NoSuchMethodException


import java.lang.reflect.*;

public class A14_NoSuchMethod {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<String> cls = String.class;
        Method m = cls.getMethod("nonExistentMethod");
    }
}
