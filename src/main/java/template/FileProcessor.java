package template;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public void process() {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line;
            while((line = reader.readLine()) != null) {
                result = getResult(result, Integer.parseInt(line));
            }
            System.out.println(String.format("result = %d", result));
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    protected abstract int getResult(int result, int number);
}
