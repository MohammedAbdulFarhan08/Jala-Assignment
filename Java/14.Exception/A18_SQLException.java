//18. Write a program to generate SQLException

import java.sql.*;

public class A18_SQLException {
    public static void main(String[] args) throws SQLException {
        throw new SQLException("Database error occurred");
    }
}
