package bg.tu_varna.sit.f24621698;

public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
       super(x,y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: (" + x + "," + y + "), width=" + width + ", height=" + height);
    }

    @Override
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
