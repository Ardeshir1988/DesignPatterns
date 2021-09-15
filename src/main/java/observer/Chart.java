package observer;

public class Chart implements Observer{
    @Override
    public UpdateType update() {
        System.out.println("chart updated");
        return UpdateType.CHART;
    }
}
