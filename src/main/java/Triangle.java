
public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        super();
        this.base = base;
        this.height = height;
    }

    public Triangle(int base) {
        super();
        this.base = base;
        this.height = base;
    }

    public int area() {
        return (base * height) / 2;
    }

}
