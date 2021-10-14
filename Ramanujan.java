public class Ramanujan {


    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        double a = Math.floor(Math.cbrt((double) n));

        int count = 0;
        for (long j = 1; j <= a; j++) {
            long b = (long) Math.ceil(Math.cbrt(n - (j * j * j)));
            long s = (j * j * j) + (b * b * b);
            if (s == n) {
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }


    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        System.out.println(isRamanujan(n));
    }
}
