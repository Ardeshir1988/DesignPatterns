package observer;

import java.util.List;

public class DataSource extends Subject{
    private int value;

    public int getValue() {
        return value;
    }

    public List<UpdateType> setValue(int value) {
        this.value = value;
        return notifyObservers();
    }
}
