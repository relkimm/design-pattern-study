package template;

public class Client {
    private static final String FILE_PATH = "sample.txt";

    public static void main(String[] args) {
        final FileProcessor fileProcessor = new PlusFileProcessor(FILE_PATH);
        fileProcessor.process();
    }
}
