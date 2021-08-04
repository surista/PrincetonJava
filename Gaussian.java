public class Gaussian {

    public static double pdf(double x) {
        return (Math.exp(-x * x / 2) / (Math.sqrt(2 * Math.PI)));
    }

    public static double pdf(double x, double mu, double sigma) {
        return (((x - mu) / sigma) / sigma);
    }


    public static double cumpdf(double x)

}
