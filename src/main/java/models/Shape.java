package models;

public class Shape {
    private String name, color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public static Shape newInstance(String name, String color) {
        return new Shape(name, color);
    }
    public String toString() {
        return String.format("Name of the shape is %s and color is %s", name, color);
    }
}
