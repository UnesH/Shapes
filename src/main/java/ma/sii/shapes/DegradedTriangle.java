package ma.sii.shapes;

class DegradedTriangle extends Triangle {
    protected int base;

    public DegradedTriangle(final int base) {
        super(base, base);
        this.base = base;
    }

    public int area() {
        return (base * base) / 2;
    }
}