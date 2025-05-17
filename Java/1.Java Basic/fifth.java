/*5. Define the local and Global variables with the same name and print both variables and
understand the scope of the variables */
public class fifth {
    // Global (instance) variable
    int number = 10;

    void display() {
        // Local variable with the same name
        int number = 20;

        System.out.println("Local variable: " + number);       
        System.out.println("Global (instance) variable: " + this.number);
    }

    public static void main(String[] args) {
        fifth obj = new fifth();
        obj.display();
    }
}
