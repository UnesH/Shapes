
public class Square extends Rectangle implements Shape {

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
