/*9. Create a PRIVATE or PROTECTED interface and print the values as above scenario */

public class PrivateInterfaceDemo {
    private interface Secret {
        void reveal();
    }

    private static class SecretImpl implements Secret {
        public void reveal() {
            System.out.println("Secret revealed!");
        }
    }

    public static void main(String[] args) {
        SecretImpl obj = new SecretImpl();
        obj.reveal();
    }
}
