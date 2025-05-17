//13. Write a program to generate NoSuchFieldException


import java.lang.reflect.*;

public class A13_NoSuchField {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<String> cls = String.class;
        Field f = cls.getDeclaredField("nonExistentField");
    }
}
