package bg.tu_varna.sit.f24621698;

/**
 * Клас, представляващ права линия между две точки.
 */
public class Line extends Shape {
    /** Втората крайна точка на линията. */
    private Point endPoint;

    /**
     * Конструктор за създаване на линия.
     * @param x1 X координата на начална точка.
     * @param y1 Y координата на начална точка.
     * @param x2 X координата на крайна точка.
     * @param y2 Y координата на крайна точка.
     * @param color Цвят на линията.
     */
    public Line(int x1, int y1, int x2, int y2, String color) {
        super(x1, y1, color);
        this.endPoint = new Point(x2, y2);
    }

    @Override
    public void translate(int dx, int dy) {
        super.translate(dx, dy); // мести началната точка
        endPoint.translate(dx, dy); // мести крайната точка
    }

    @Override
    public void draw() {
        System.out.println("line " + position.getX() + " " + position.getY() + " " + endPoint.getX() + " " + endPoint.getY() + " " + color);
    }

    @Override
    public String toSvgTag() {
        return String.format("<line x1=\"%d\" y1=\"%d\" x2=\"%d\" y2=\"%d\" stroke=\"%s\" />",
                position.getX(), position.getY(), endPoint.getX(), endPoint.getY(), color);
    }

    @Override
    public boolean isWithinRect(int rx, int ry, int rw, int rh) {
        // Линията е вътре, ако и двете ѝ крайни точки са вътре
        return isPointInRect(position, rx, ry, rw, rh) && isPointInRect(endPoint, rx, ry, rw, rh);
    }

    @Override
    public boolean isWithinCircle(int cx, int cy, int r) {
        return isPointInCircle(position, cx, cy, r) && isPointInCircle(endPoint, cx, cy, r);
    }

    private boolean isPointInRect(Point p, int rx, int ry, int rw, int rh) {
        return p.getX() >= rx && p.getX() <= rx + rw && p.getY() >= ry && p.getY() <= ry + rh;
    }

    private boolean isPointInCircle(Point p, int cx, int cy, int r) {
        return Math.sqrt(Math.pow(p.getX() - cx, 2) + Math.pow(p.getY() - cy, 2)) <= r;
    }
}