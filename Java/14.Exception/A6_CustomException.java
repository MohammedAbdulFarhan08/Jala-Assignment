//6. Write a program to create your own exception


class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class A6_CustomException {
    public static void main(String[] args) throws MyException {
        throw new MyException("This is a user-defined exception");
    }
}
