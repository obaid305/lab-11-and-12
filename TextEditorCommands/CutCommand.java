public class CutCommand implements Command {
    private TextEditor editor;

    public CutCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.cut();
    }

    @Override
    public void undo() {
        editor.undo();
    }
}
