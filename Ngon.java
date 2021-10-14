public class Ngon {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        double angle = 360.0 / N;
        double step = Math.sin(Math.toRadians(angle / 2.0));

        Turtle t = new Turtle(0.5, 0.0, angle / 2.0);

        for (int i = 0; i < N; i++) {
            t.goForward(step);
            t.turnLeft(angle);

        }

    }
}
