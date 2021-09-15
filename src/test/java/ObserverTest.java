import observer.Chart;
import observer.DataSource;
import observer.SpreadSheet;
import observer.UpdateType;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ObserverTest {
    @Test
    public void testUpdateObserver() {
        var datasource = new DataSource();
        var sheet = new SpreadSheet();
        var chart = new Chart();

        datasource.addObserver(sheet);
        datasource.addObserver(chart);

        Assert.assertArrayEquals(List.of(UpdateType.SPREAD_SHEET, UpdateType.CHART).toArray(), datasource.setValue(1).toArray());

        var chart1 = new Chart();
        datasource.addObserver(chart1);

        Assert.assertArrayEquals(List.of(UpdateType.SPREAD_SHEET, UpdateType.CHART, UpdateType.CHART).toArray(), datasource.setValue(2).toArray());
    }
}
