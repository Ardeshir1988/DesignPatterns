import org.junit.Assert;
import org.junit.Test;
import state.Context;
import state.StartState;
import state.StopState;

public class StateTest {
    Context context = new Context();

    @Test
    public void StateObjectTest() {
        StartState startState = new StartState();
        startState.doAction(context);
        Assert.assertEquals(startState, context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);
        Assert.assertEquals(stopState, context.getState());
    }
}
