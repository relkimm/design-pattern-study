package template;

public class PlusFileProcessor extends FileProcessor {

    public PlusFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result + number;
    }
}
