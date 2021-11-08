package template.callback;

@FunctionalInterface
public interface ResultOperator {
    int getResult(int result, int number);
}
