package ma.sii.shapes;

class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(final int base, final int height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(final int base) {
        this.base = base;
        this.height = base;
    }

    public int area() {
        return (base * height) / 2;
    }

}
