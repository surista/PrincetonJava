import java.awt.Color;

public class AlbersSquares {
    public static void main(String[] args) {
        int r1 = Integer.parseInt(args[0]);
        int g1 = Integer.parseInt(args[1]);
        int b1 = Integer.parseInt(args[2]);

        int r2 = Integer.parseInt(args[3]);
        int g2 = Integer.parseInt(args[4]);
        int b2 = Integer.parseInt(args[5]);

        Color c1 = new Color(r1, g1, b1);
        Color c2 = new Color(r2, g2, b2);

        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.25, 0.5, 0.2);

        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.25, 0.5, 0.1);

    }

}


