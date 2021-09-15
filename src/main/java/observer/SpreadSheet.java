package observer;

public class SpreadSheet implements Observer{
    @Override
    public UpdateType update() {
        System.out.println("update spread sheet");
        return UpdateType.SPREAD_SHEET;
    }
}
