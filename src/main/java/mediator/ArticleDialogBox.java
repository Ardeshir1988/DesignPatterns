package mediator;

public class ArticleDialogBox extends DialogBox{
    private ListBox articleListBox = new ListBox(this);
    private Button saveButton = new Button(this);
    private TextBox titleTextBox = new TextBox(this);

    @Override
    public void change(UIControl uiControl) {
        if (uiControl == articleListBox)
            articleSelected();
        else if (uiControl == titleTextBox)
            titleChanged();

    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }

    private void articleSelected(){
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnable(true);
    }
}
