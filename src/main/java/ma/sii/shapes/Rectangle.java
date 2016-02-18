package ma.sii.shapes;

class Rectangle extends Shape {
    protected int width;
    protected int lenght;

    public Rectangle(final int width, final int lenght) {
        super();
        this.width = width;
        this.lenght = lenght;
    }

    public int area() {
        return width * lenght;
    }

}
