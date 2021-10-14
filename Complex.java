public class Complex {

    private double re;
    private double img;


    public Complex(double real, double imag) {
        re = real;
        img = imag;
    }

    public Complex plus(Complex b) {
        double real = this.re + b.re;
        double imag = this.img + b.img;

        return new Complex(real, imag);
    }

    public Complex times(Complex b) {
        double real = this.re * b.re - this.img * b.img;
        double imag = this.re * b.img + this.img * b.re;

        return new Complex(real, imag);
    }

    public double abs(Complex b) {
        return Math.sqrt(this.re * this.re + this.img * this.img);
    }


    public String toString() {
        return this.re + " + " + this.img + "i";
    }

    public static void main(String[] args) {
        Complex a = new Complex(3.0, 4.0);
        Complex b = new Complex(-2.0, 3.0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a * b = " + a.times(b));
    }
}

