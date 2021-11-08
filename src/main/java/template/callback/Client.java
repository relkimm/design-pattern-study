package template.callback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("sample.txt");
        fileProcessor.process((result, number) -> result + number);
        fileProcessor.process((result, number) -> result * number);
        fileProcessor.process((result, number) -> result - number);
    }
}
