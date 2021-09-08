package memento;

import java.util.Stack;

public class CareTaker {
    private final Stack<Memento> states = new Stack<>();

    public void pushState(Memento state) {
        states.push(state);
    }

    public Memento popState() {
        states.pop();
        return states.peek();
    }
}
