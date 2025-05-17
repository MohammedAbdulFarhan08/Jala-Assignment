//11. Write a program to generate FileNotFoundException


import java.io.*;

public class A11_FileNotFound {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("non_existing_file.txt");
    }
}
