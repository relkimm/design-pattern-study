package template;

public class MultipleFileProcessor extends FileProcessor {

    MultipleFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result * number;
    }
}
