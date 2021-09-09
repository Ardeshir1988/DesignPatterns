import org.junit.Assert;
import org.junit.Test;
import strategy.AddOperation;
import strategy.Context;
import strategy.SubtractOperation;

public class StrategyTest {
    @Test
    public void operationStrategyTest() {
        Context context = new Context(new AddOperation());
        Assert.assertEquals(15, context.executeStrategy(10, 5));

        context = new Context(new SubtractOperation());
        Assert.assertEquals(5, context.executeStrategy(10, 5));
    }
}
