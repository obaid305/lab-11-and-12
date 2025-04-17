public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Command cut = new CutCommand(editor);
        Command copy = new CopyCommand(editor);
        Command paste = new PasteCommand(editor);

        Button cutButton = new Button(cut);
        Button copyButton = new Button(copy);
        Button pasteButton = new Button(paste);

        // Simulate button clicks
        System.out.println("Initial Text: " + editor.getText());

        copyButton.click();
        cutButton.click();
        pasteButton.click();

        System.out.println("\nAfter Operations: " + editor.getText());

        // Undo last operation (paste)
        pasteButton.undoClick();
        System.out.println("\nAfter Undo Paste: " + editor.getText());

        // Undo cut
        cutButton.undoClick();
        System.out.println("\nAfter Undo Cut: " + editor.getText());
    }
}
