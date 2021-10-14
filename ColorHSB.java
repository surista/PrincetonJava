/**
 * The ColorHSB class takes three integer arguments
 * and returns the pre-defined output that is closed
 */

public class ColorHSB {
    private final int hue;    //  Integer between 0 and 359.
    private final int sat;     // Integer between 0 and 100; purity of the hue
    private final int bright;  // Integer between 0 and 100; % of white mixed with the hue

    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {

        if ((h < 0) || (h > 359) || (s < 0) || (s > 100) || (b < 0) || (b > 100)) {
            throw new IllegalArgumentException("arguments out of range");
        }

        hue = h;
        sat = s;
        bright = b;
    }


    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return "(" + hue + ", " + sat + ", " + bright + ")";
    }

    //
    // // Is this color a shade of gray?
    public boolean isGrayscale() {
        return (this.sat == 0) || (this.bright == 0);
    }


    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that) {

        if (that == null) {
            throw new IllegalArgumentException("argument is null");
        }

        ColorHSB a = this;


        int hueDis = (int) Math.pow(a.hue - that.hue, 2);
        int dis360 = (int) ((Math.pow(360 - (Math.abs(a.hue - that.hue)), 2)));
        int minHue = Math.min(hueDis, dis360);
        int minSat = (int) Math.pow((a.sat - that.sat), 2);
        int minBright = (int) Math.pow((a.bright - that.bright), 2);

        int minDistance = minHue + minSat + minBright;

        return minDistance;
    }


    // Sample client (see below).
    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        ColorHSB a = new ColorHSB(h, s, b);

        int minDistance = 999999;
        int minCurrent = 0;
        String colorNear = "";
        String colorData = "";
        String colorNearData = "";

        while (!StdIn.isEmpty()) {
            String color2 = StdIn.readString();
            int h2 = StdIn.readInt();
            int s2 = StdIn.readInt();
            int b2 = StdIn.readInt();

            ColorHSB that = new ColorHSB(h2, s2, b2);
            minCurrent = a.distanceSquaredTo(that);
            colorData = that.toString();
            if (minCurrent < minDistance) {
                minDistance = minCurrent;
                colorNear = color2;
                colorNearData = colorData;

            }
        }
        System.out.println(colorNear + " " + colorNearData);

    }
}


