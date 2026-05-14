package models;

public class Paragraph extends Item {
    private String color;

    public Paragraph(String tip, String color) {
        super(tip);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
