import java.awt.Color;

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setXscale(0.0, (double) n);
        StdDraw.setYscale(0.0, (double) n);

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if ((r + c) % 2 == 0) {
                    StdDraw.setPenColor(Color.BLUE);
                }
                else {
                    StdDraw.setPenColor(Color.LIGHT_GRAY);
                }
                StdDraw.filledSquare(r + 0.5, c + 0.5, 0.5);
            }
        }
    }
}
