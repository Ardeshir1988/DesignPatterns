package command;

public class ButtonTool {
    private String label;
    private final Command command;

    public ButtonTool(Command command) {
        this.command = command;
    }

    public CommandType click(){
        return command.execute();
    }
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
