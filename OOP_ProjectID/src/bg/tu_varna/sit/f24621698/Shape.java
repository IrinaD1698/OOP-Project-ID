package bg.tu_varna.sit.f24621698;

/**
 * Абстрактен клас, представляващ базова фигура в графичния редактор.
 * Обединява общи характеристики като позиция и цвят.
 */
public abstract class Shape {
    /** Позиция на фигурата в координатното пространство. */
    protected Point position;
    /** Цвят на запълване или контур на фигурата. */
    protected String color;

    /**
     * Конструктор за инициализиране на базова фигура.
     * @param x X координата на началната точка.
     * @param y Y координата на началната точка.
     * @param color Цвят на фигурата.
     */
    public Shape(int x, int y, String color) {
        this.position = new Point(x, y);
        this.color = color;
    }

    /**
     * Транслира (премества) фигурата в пространството.
     * @param dx Стойност на преместване по оста X.
     * @param dy Стойност на преместване по оста Y.
     */
    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    /** Визуализира информация за фигурата на стандартния изход. */
    public abstract void draw();

    /** * Генерира SVG таг, съответстващ на фигурата.
     * @return String представляващ валиден SVG елемент.
     */
    public abstract String toSvgTag();

    /**
     * Проверява дали фигурата е изцяло разположена в рамките на даден кръг.
     * @param cx X координата на центъра на региона.
     * @param cy Y координата на центъра на региона.
     * @param r Радиус на региона.
     * @return true, ако фигурата е вътре в кръга.
     */
    public abstract boolean isWithinCircle(int cx, int cy, int r);

    /**
     * Проверява дали фигурата е изцяло разположена в рамките на правоъгълен регион.
     * @param rx X координата на горния ляв ъгъл на региона.
     * @param ry Y координата на горния ляв ъгъл на региона.
     * @param rw Ширина на региона.
     * @param rh Височина на региона.
     * @return true, ако фигурата е вътре в правоъгълника.
     */
    public abstract boolean isWithinRect(int rx, int ry, int rw, int rh);
}