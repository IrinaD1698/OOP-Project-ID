package bg.tu_varna.sit.f24621698;

/**
 * Клас, представляващ геометричната фигура Кръг.
 */
public class Circle extends Shape {
    private int r;

    /**
     * Конструктор за създаване на кръг.
     * @param cx X координата на центъра.
     * @param cy Y координата на центъра.
     * @param r Радиус на кръга.
     * @param color Цвят на кръга.
     */
    public Circle(int cx, int cy, int r, String color) {
        super(cx, cy, color);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("circle " + position.getX() + " " + position.getY() + " " + r + " " + color);
    }

    @Override
    public String toSvgTag() {
        return String.format("<circle cx=\"%d\" cy=\"%d\" r=\"%d\" fill=\"%s\" />",
                position.getX(), position.getY(), r, color);
    }

    @Override
    public boolean isWithinRect(int rx, int ry, int rw, int rh) {
        int cx = position.getX();
        int cy = position.getY();
        // Кръгът е вътре, ако най-отдалечените му точки по X и Y са в границите
        return (cx - r >= rx && cx + r <= rx + rw && cy - r >= ry && cy + r <= ry + rh);
    }

    @Override
    public boolean isWithinCircle(int cx, int cy, int cr) {
        // Използваме разстоянието между центровете + радиуса на текущия кръг
        double dist = Math.sqrt(Math.pow(position.getX() - cx, 2) + Math.pow(position.getY() - cy, 2));
        return dist + r <= cr;
    }
}