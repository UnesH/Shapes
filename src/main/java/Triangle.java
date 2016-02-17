
public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(final int base, final int height) {
        this.base = base;
        this.height = height;
    }

    public int area() {
        return (base * height) / 2;
    }

}
