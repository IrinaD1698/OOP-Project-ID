package bg.tu_varna.sit.f24621698;

/**
 * Клас, представляващ геометричната фигура Правоъгълник.
 */
public class Rectangle extends Shape {
    private int width, height;

    /**
     * Конструктор за създаване на правоъгълник.
     * @param x X координата на горния ляв ъгъл.
     * @param y Y координата на горния ляв ъгъл.
     * @param width Ширина.
     * @param height Височина.
     * @param color Цвят.
     */
    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("rectangle " + position.getX() + " " + position.getY() + " " + width + " " + height + " " + color);
    }

    @Override
    public String toSvgTag() {
        return String.format("<rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\" fill=\"%s\" />",
                position.getX(), position.getY(), width, height, color);
    }

    @Override
    public boolean isWithinRect(int rx, int ry, int rw, int rh) {
        int x = position.getX();
        int y = position.getY();
        return (x >= rx && y >= ry && (x + width) <= (rx + rw) && (y + height) <= (ry + rh));
    }

    @Override
    public boolean isWithinCircle(int cx, int cy, int r) {
        int x = position.getX();
        int y = position.getY();
        // Правоъгълникът е вътре в кръга само ако и четирите му ъгъла са вътре
        return isPointInCircle(x, y, cx, cy, r) &&
                isPointInCircle(x + width, y, cx, cy, r) &&
                isPointInCircle(x, y + height, cx, cy, r) &&
                isPointInCircle(x + width, y + height, cx, cy, r);
    }

    /** Помощен метод за проверка на точка спрямо кръг. */
    private boolean isPointInCircle(int px, int py, int cx, int cy, int r) {
        return Math.sqrt(Math.pow(px - cx, 2) + Math.pow(py - cy, 2)) <= r;
    }
}