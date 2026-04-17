package bg.tu_varna.sit.f24621698;

public class Line extends Shape{
private int x2,y2;
public Line(int x, int y, int x2, int y2){
   super(x,y);
    this.x2 = x2;
    this.y2 = y2;
}
@Override
public void draw(){
    System.out.println("Line: (" + x + ", " + y + "), (" + x2 + ", " + y2 + ")");
}
@Override
public void translate(int dx, int dy) {
    x += dx;
    y += dy;
    x2 += dx;
    y2 += dy;
}
}
