//3. Use Interface instances to call the implemented method in the implemented class

interface Drawable {
    void draw();
}

public class InterfaceInstanceCall implements Drawable {
    public void draw() {
        System.out.println("Drawing a shape...");
    }

    public static void main(String[] args) {
        Drawable obj = new InterfaceInstanceCall(); // interface reference
        obj.draw();
    }
}
