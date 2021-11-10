package visitor;

public class Client {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        Device device = new Phone();
        shape.accept(device);
    }
}
