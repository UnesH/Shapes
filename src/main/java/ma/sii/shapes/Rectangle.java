package ma.sii.shapes;

class Rectangle implements Shape {

    private int width;
    private int lenght;

    public Rectangle(final int width, final int lenght) {
        super();
        this.width = width;
        this.lenght = lenght;
    }

    public int area() {
        return width * lenght;
    }

}
