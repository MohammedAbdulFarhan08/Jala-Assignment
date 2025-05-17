/*1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
methods and a main method*/
public class static1 {

    // Static variables (shared by all objects)
    static String collegeName = "MJ College";
    static int totalStudents = 1000;

    // Instance variables (unique to each object)
    String studentName;
    int rollNumber;

    // Static method 1
    public static void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
    }

    // Static method 2
    public static void updateTotalStudents(int newTotal) {
        totalStudents = newTotal;
        System.out.println("Total students updated to: " + totalStudents);
    }

    // Instance method 1
    public void setStudentDetails(String name, int roll) {
        studentName = name;
        rollNumber = roll;
    }

    // Instance method 2
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
    }

    // Main method
    public static void main(String[] args) {
        // Call static methods
        static1.displayCollegeInfo();
        static1.updateTotalStudents(1050);

        // Create object and use instance methods
        static1 student1 = new static1();
        student1.setStudentDetails("Ayaan", 101);
        student1.displayStudentDetails();

        static1 student2 = new static1();
        student2.setStudentDetails("Farhan", 102);
        student2.displayStudentDetails();
    }
}


