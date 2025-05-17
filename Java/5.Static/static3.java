//3. Print static variables in Instance methods

public class static3 {
    // Static variables
    static String college = "MJ College";
    static int yearEstablished = 1985;

    // Instance method
    public void printCollegeInfo() {
        // Direct access to static variables
        System.out.println("College: " + college);
        System.out.println("Year Established: " + yearEstablished);
    }

    public static void main(String[] args) {
        // Create object to call instance method
        static3 obj = new static3();
        obj.printCollegeInfo();
    }
}


