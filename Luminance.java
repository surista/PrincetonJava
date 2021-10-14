import java.awt.Color;

public class Luminance {
    public static double lum(Color c) {
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();

        return r * 0.299 + g * 0.587 + b * 0.114;
    }


    public static Color toGray(Color c) {
        int y = (int) Math.round(lum(c));
        Color gray = new Color(y, y, y);
        return gray;
    }

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);


        int r1 = Math.abs(r * 2 - 255);
        int g1 = Math.abs(g * 2 - 255);
        int b1 = Math.abs(b * 2 - 255);

        Color c = new Color(r, g, b);
        Color c1 = new Color(r1, g1, b1);

        System.out.println(Math.round(lum(c)));

        System.out.println(compatible(c, c1));
    }

    public static boolean compatible(Color c1, Color c2) {
        double lum1 = lum(c1);
        double lum2 = lum(c2);

        return (Math.abs(lum1 - lum2) > 128.0);

    }
}
