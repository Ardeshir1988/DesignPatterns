package template;

public class TransferMoneyTask extends Task{
    @Override
    protected TaskOperation doExecute() {
        return TaskOperation.TRANSFER;
    }
}
