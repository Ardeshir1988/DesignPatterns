import memento.CareTaker;
import memento.Originator;
import org.junit.Assert;
import org.junit.Test;

public class MementoTest {

    private final Originator editor = new Originator();
    private final CareTaker history = new CareTaker();

    @Test
    public void testStates() {
        editor.setState("a");
        history.pushState(editor.saveState());

        editor.setState("b");
        history.pushState(editor.saveState());

        editor.setState("c");
        history.pushState(editor.saveState());

        Assert.assertEquals(editor.getState(), "c");

        editor.setState("x");
        history.pushState(editor.saveState());

        Assert.assertEquals(editor.getState(), "x");

        editor.restoreState(history.popState());

        Assert.assertEquals(editor.getState(), "c");
    }
}
