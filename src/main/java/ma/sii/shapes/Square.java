package ma.sii.shapes;

class Square extends Shape {

    private int width;

    public Square(final int width) {
        this.width = width;
    }

    public int area() {
        return width * width;
    }

}
