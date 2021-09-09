package strategy;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int x, int y) {
        return strategy.execute(x, y);
    }
}
