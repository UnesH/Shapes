
public class Rectangle implements Shape {

    protected int width;
    protected int lenght;

    public Rectangle(int width, int lenght) {
        super();
        this.width = width;
        this.lenght = lenght;
    }

    public int area() {
        return width * lenght;
    }

}
