//2. Print instance variables in static methods
public class static2 {
    // Instance variables
    String name = "Farhan";
    int age = 21;

    // Static method
    public static void showDetails() {
        // Create object to access instance variables
        static2 obj = new static2();
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }

    public static void main(String[] args) {
        showDetails();
    }
}


