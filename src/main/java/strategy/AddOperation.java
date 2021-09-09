package strategy;

public class AddOperation implements Strategy {
    @Override
    public int execute(int x, int y) {
        return x + y;
    }
}
