//9. Write a program to read data from properties file.

import java.io.*;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);

        System.out.println("Username: " + prop.getProperty("username"));
        System.out.println("Password: " + prop.getProperty("password"));
    }
}
