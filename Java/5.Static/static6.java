//6. Print all the static, instance variables in main method

public class static6 {

    // Static variables
    static String collegeName = "MJ College";
    static int establishedYear = 1985;

    // Instance variables
    String studentName;
    int studentAge;

    // Constructor to initialize instance variables
    public static6(String name, int age) {
        this.studentName = name;
        this.studentAge = age;
    }

    public static void main(String[] args) {
        // Access static variables directly
        System.out.println("Static Variable - College Name: " + collegeName);
        System.out.println("Static Variable - Established Year: " + establishedYear);

        // Create object to access instance variables
        static6 student = new static6("Farhan", 21);

        // Access instance variables through the object
        System.out.println("Instance Variable - Student Name: " + student.studentName);
        System.out.println("Instance Variable - Student Age: " + student.studentAge);
    }
}


