package src.lang.object.test;

public class Rectangle {
    private int width, height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{width="+this.width + ", height=" + this.height + "}";
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle re = (Rectangle) obj;
        return width == re.width && height == re.height;
    }
}
