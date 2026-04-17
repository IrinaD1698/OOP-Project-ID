package bg.tu_varna.sit.f24621698;

    public class Circle extends Shape {

        private int x, y, r;

        public Circle(int x, int y, int r) {
          super(x,y);
            this.r = r;
        }

        @Override
        public void draw() {
            System.out.println("Circle: center(" + x + "," + y + "), radius=" + r);
        }

        @Override
        public void translate(int dx, int dy) {
            x += dx;
            y += dy;
        }
    }

