package bg.tu_varna.sit.f24621698;

public class Line extends Shape{
private int x1,y1,x2,y2;
public Line(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
}
@Override
public void draw(){
    System.out.println("Line: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
}
@Override
public void translate(int dx, int dy) {
    x1 += dx; y1 += dy;
    x2 += dx; y2 += dy;
}
}
