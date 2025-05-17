//12. Write a program to generate IOException


import java.io.*;

public class A12_IOException {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        System.out.println(br.readLine());
        br.close();
    }
}
