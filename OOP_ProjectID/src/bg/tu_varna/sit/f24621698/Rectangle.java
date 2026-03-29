package bg.tu_varna.sit.f24621698;

public class Rectangle extends Shape {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
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
