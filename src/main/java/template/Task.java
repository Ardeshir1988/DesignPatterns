package template;

import java.util.List;

public abstract class Task {
    private final AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public List<TaskOperation> execute() {
        TaskOperation op1 = auditTrail.record();
        TaskOperation op2 = doExecute();
        return List.of(op1, op2);
    }

    protected abstract TaskOperation doExecute();
}