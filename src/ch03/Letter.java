package ch03;

public class Letter {
    private String from;
    private String to;
    private String text = "";

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void addLine(String line) {
        if (!text.isEmpty())
            text += "\n";
        text += line;
    }

    public String getText() {
        return String.format("Dear %s:%n%n%s%n%nSincerely,%n%n%s", to, text, from);
    }
}
