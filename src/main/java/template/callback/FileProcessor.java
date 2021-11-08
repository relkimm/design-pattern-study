package template.callback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public void process(ResultOperator operator) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line;
            while((line = reader.readLine()) != null) {
                result = operator.getResult(result, Integer.parseInt(line));
            }
            System.out.println(String.format("result = %d", result));

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
