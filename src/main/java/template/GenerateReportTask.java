package template;

public class GenerateReportTask extends Task{
    @Override
    protected TaskOperation doExecute() {
        return TaskOperation.REPORT;
    }
}
