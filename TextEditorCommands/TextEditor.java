public class TextEditor {
    private String clipboard = "";
    private String text = "This is some sample text.";
    private String lastText = "";

    public void cut() {
        lastText = text;
        clipboard = text;
        text = "";
        System.out.println("Cut performed. Text is now empty.");
    }

    public void copy() {
        clipboard = text;
        System.out.println("Copied text to clipboard: " + clipboard);
    }

    public void paste() {
        lastText = text;
        text += clipboard;
        System.out.println("Pasted clipboard to text. Text is now: " + text);
    }

    public void undo() {
        text = lastText;
        System.out.println("Undo performed. Text is now: " + text);
    }

    public String getText() {
        return text;
    }
}
