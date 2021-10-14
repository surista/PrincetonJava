public class Turtle {
    private double x, y;
    private double angle;


    public Turtle(double x0, double y0, double a0) {
        x = x0;
        y = y0;
        angle = a0;
    }

    public void turnLeft(double delta) {
        angle += delta;
    }

    public void goForward(double distance) {
        double oldx = x;
        double oldy = y;

        x += distance * Math.cos(Math.toRadians(angle));
        y += distance * Math.sin(Math.toRadians(angle));
        StdDraw.line(oldx, oldy, x, y);
    }

    public static void main(String[] args) {
        Turtle t = new Turtle(0.0, 0.0, 0.0);
        t.goForward(1.0);
        t.turnLeft(120);
        t.goForward(1.0);
        t.turnLeft(120);
        t.goForward(1.0);
        t.turnLeft(120);


    }
}
