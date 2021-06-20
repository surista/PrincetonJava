public class GreatCircle {
    public static void main(String[] args) {

        final double R = 6371.0;

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double xSin = (x2 - x1) / 2;
        double ySin = (y2 - y1) / 2;

        double result = 2 * R * Math
                .asin(Math.sqrt(Math.sin(xSin) * Math.sin(xSin) + Math.cos(x1) * Math.cos(x2) * Math
                        .sin(ySin) * Math.sin(ySin)));

        System.out.println(result + " kilometers");
    }
}
