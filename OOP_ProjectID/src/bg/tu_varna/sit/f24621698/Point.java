package bg.tu_varna.sit.f24621698;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
