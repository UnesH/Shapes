package ma.sii.shapes;

class Square extends Rectangle {

    private int width;

    public Square(final int width) {
        super(width, width);
        this.width = width;
    }

    @Override
    public int area() {
        return width * width;
    }

}
