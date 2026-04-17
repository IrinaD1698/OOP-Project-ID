package bg.tu_varna.sit.f24621698;

import java.util.List;

public abstract class Shape {
    public abstract void draw();
    public abstract void translate(int x, int y);
    public List<Point> getPoints() {

    }
    public Shape(int x,int y){
        this.x=x;
        this.y=y;
    }


}
