package strategy;

public class SubtractOperation implements Strategy {
    @Override
    public int execute(int x, int y) {
        return x - y;
    }
}
