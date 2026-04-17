package bg.tu_varna.sit.f24621698;

public class ShapeSystem {

    public static boolean isValidCircle(int radius) {
        return radius > 0;
    }

    public static boolean isValidRectangle(int width, int height) {
        return width > 0 && height > 0;
    }

    public static boolean isValidLine(int x, int y, int x2, int y2) {
        return !(x == x2 && y == y2);
    }

    public static boolean isInsideRegion(int x, int y) {
        return x >= 0 && y >= 0;
    }
}

