package ma.sii.shapes;

class DegradedTriangle implements Shape {
    private int base;

    public DegradedTriangle(final int base) {
        this.base = base;
    }

    public int area() {
        return (base * base) / 2;
    }
}
