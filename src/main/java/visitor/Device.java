package visitor;

public interface Device {
    void print(Triangle triangle);
    void print(Rectangle rectangle);
    void print(Circle circle);
}
