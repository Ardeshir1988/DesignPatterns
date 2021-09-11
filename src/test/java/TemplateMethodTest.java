import org.junit.Assert;
import org.junit.Test;
import template.GenerateReportTask;
import template.TaskOperation;
import template.TransferMoneyTask;

import java.util.List;

public class TemplateMethodTest {
    @Test
    public void TaskTest() {
        var task1 = new TransferMoneyTask();
        Assert.assertArrayEquals(List.of(TaskOperation.AUDIT,TaskOperation.TRANSFER).toArray(),task1.execute().toArray());
        var task2 = new GenerateReportTask();
        Assert.assertArrayEquals(List.of(TaskOperation.AUDIT,TaskOperation.REPORT).toArray(),task2.execute().toArray());
    }
}
